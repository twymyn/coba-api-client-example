package coba.api.example.client.util;

import coba.api.example.client.cli.CliParameters;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

import javax.net.ssl.SSLException;

/**
 * Util class to preconfigure a {@link WebClient} instance.
 * <p>
 * For example it is possible to disable the certification validation.
 */
public class WebClientUtil {
    public static WebClient.Builder builder(CliParameters cliParameters) {
        if (cliParameters.isInsecure()) {
            System.out.println("Build WebClient without certification validation. DO NOT DO THIS IN PRODUCTION!");
            try {
                SslContext sslContext = SslContextBuilder
                        .forClient()
                        .trustManager(InsecureTrustManagerFactory.INSTANCE)
                        .build();
                HttpClient httpClient = HttpClient.create().secure(t -> t.sslContext(sslContext));
                return WebClient.builder().clientConnector(new ReactorClientHttpConnector(httpClient));
            } catch (SSLException e) {
                System.err.println("Could not disable certification validation");
                return WebClient.builder();
            }
        } else {
            return WebClient.builder();
        }
    }
}
