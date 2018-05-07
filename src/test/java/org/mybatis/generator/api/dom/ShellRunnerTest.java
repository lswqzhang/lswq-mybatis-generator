package org.mybatis.generator.api.dom;

import org.junit.Test;
import org.mybatis.generator.api.ShellRunner;

public class ShellRunnerTest {
    
    
    @Test
    public void runTest() {

        String file = getFile("generator/generatorConfig.xml");

        ShellRunner.run(new String[]{"-configfile", file, "-overwrite"});
    }

    private String getFile(String fileName){


        ClassLoader classLoader = getClass().getClassLoader();

        String result = classLoader.getResource(fileName).getPath();

        return result;

    }
}
