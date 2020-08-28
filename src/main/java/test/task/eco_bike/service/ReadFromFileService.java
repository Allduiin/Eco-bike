package test.task.eco_bike.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public interface ReadFromFileService {
    void read(String path) throws IOException;
}
