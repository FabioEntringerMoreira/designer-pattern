package com.company.strtucturals.adapter.utils;

public class TokenGenerator {

    private String token;

    public TokenGenerator(){
        this.token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkRlc2lnbiBQ" +
                "YXR0ZXJucyIsImlhdCI6MTUxNjIzOTAyMn0.jQYG6AygwBxQMZGCY1nKELXkjAtNB0j8mbr5y_7-49I";
    }

    public String getToken() {
        return token;
    }
}
