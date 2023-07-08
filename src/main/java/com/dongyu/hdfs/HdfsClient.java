package com.dongyu.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HdfsClient {

    private FileSystem fileSystem;
    public void init() throws URISyntaxException, IOException {
        URI uri = new URI("hdfs://localhost:8020");

        Configuration configuration = new Configuration();

        fileSystem = FileSystem.get(uri, configuration);
    };

    public void close() throws IOException {
        fileSystem.close();
    }
    @Test
    public void testMkfir() throws URISyntaxException, IOException {


        fileSystem.mkdirs(new Path("/test"));

        fileSystem.close();

    }
}
