package org.example.api.pojo.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AuthRequestPojo{

	@JsonProperty("password")
	private String password;

	@JsonProperty("username")
	private String username;
}