package coba.api.example.client.cli;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum Example {
    SECURITIES("securities"),
    BRANCH_FINDER("branch-finder"),
    TOKEN_REFRESH("token-refresh");

    private final String cliName;

    Example(String cliName) {
        this.cliName = cliName;
    }

    public static Example getByCliName(String cliName) {
        for (Example value : Example.values()) {
            if (value.cliName.equals(cliName)) {
                return value;
            }
        }
        return null;
    }

    public static String cliNamesToString() {
        return Arrays.stream(Example.values()).map(e -> e.cliName).collect(Collectors.joining(", "));
    }
}
