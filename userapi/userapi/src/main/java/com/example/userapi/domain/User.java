package com.example.userapi.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    // 기본 생성자
    public User() {
    }

    // 모든 필드를 포함한 생성자 (선택적)
    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // id의 게터와 세터
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // name의 게터와 세터
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // email의 게터와 세터
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}