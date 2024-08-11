package com.argus.mytodo.entities.dtos;


import com.argus.mytodo.Enums.RoleENUM;
import com.argus.mytodo.entities.BaseEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class UserDto extends BaseEntity {
    private Long id;
    private UUID uuid;
    private String firstname;
    private String lastname;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String email;
    private String picture;
    private RoleENUM role;
    private List<AuthorityDto> authorities;
}
