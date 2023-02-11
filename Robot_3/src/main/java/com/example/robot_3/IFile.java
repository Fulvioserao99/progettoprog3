package com.example.robot_3;

import java.io.IOException;
import java.util.ArrayList;

public interface IFile {

    public void open() throws IOException;
    public Boolean write() throws IOException;
    public ArrayList<String> read() throws IOException;
    public void close() throws IOException;

}
