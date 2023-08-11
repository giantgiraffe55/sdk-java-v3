package com.trulioo.normalizedapi.auth;

/**
 * OAuth flows that are supported by this client
 */

public enum OAuthFlow {
    ACCESS_CODE, //called authorizationCode  in OpenAPI 3.0
    IMPLICIT,
    PASSWORD,
    APPLICATION //called clientCredentials in OpenAPI 3.0
}
