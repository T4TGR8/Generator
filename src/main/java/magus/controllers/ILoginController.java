package magus.controllers;

import magus.exceptions.WrongUserNameOrPasswordException;

import java.io.IOException;

public interface ILoginController {
    void bt_LoginPressed() throws IOException, WrongUserNameOrPasswordException;
}
