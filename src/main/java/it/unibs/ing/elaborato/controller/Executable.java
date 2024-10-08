package it.unibs.ing.elaborato.controller;

import it.unibs.ing.elaborato.exception.FileWriterException;
import it.unibs.ing.elaborato.exception.LogoutException;

public interface Executable {
    void execute() throws LogoutException, FileWriterException;
}
