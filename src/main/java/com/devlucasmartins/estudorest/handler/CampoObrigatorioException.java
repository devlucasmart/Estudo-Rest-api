package com.devlucasmartins.estudorest.handler;

public class CampoObrigatorioException extends BusinessException{
    public CampoObrigatorioException(String campo) {
        super("O Campo %s é obrigatório", campo);
    }
}
