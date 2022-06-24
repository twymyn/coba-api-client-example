package coba.api.example.client.oauth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * Controller class to receive the OAuth code, after a redirect from the login page.
 */
@Controller
public class OAuthResponseController {

    // The BlockingQueue is used to transmit the OAuth code to the main thread.
    private BlockingQueue<AuthorizationCode> responses = new SynchronousQueue<>();

    @GetMapping("/login/oauth2/code/commerz")
    @ResponseBody
    public AuthorizationCode callbackEndpoint(
            @RequestParam("code") String code,                  // Read the URL query parameter code
            @RequestParam("session_state") String sessionState  // Read the URL query parameter session_state
    ) {
        AuthorizationCode authorizationCode = new AuthorizationCode(code, sessionState);
        responses.add(authorizationCode);
        return authorizationCode;
    }

    /**
     * Blocking call to get the response from the login redirect.
     *
     * @param timeout how long to wait before giving up
     * @param timeUnit unit a {@code TimeUnit} determining how to interpret the {@code timeout} parameter
     * @return code and session state from the OAuth login process.
     */
    public AuthorizationCode getResponse(long timeout, TimeUnit timeUnit) {
        try {
            return responses.poll(timeout, timeUnit);
        } catch (InterruptedException e) {
            System.out.println("Timeout. Got no callback call from OAuth login");
            System.exit(1);
        }
        return null;
    }
}
