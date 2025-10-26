package com.example.backend.dto;

//record porque o credencial é apenas para recpetion
public record CredencialDto(String login, char[] password) {

}
