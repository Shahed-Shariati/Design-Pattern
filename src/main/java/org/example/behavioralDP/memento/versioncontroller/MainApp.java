package org.example.behavioralDP.memento.versioncontroller;

public class MainApp {
    public static void main(String[] args) {
        String code = "class MainApp { SourceCodeFile sourceCodeFile = new SourceCodeFile(code);}";
        SourceCodeFile sourceCodeFile = new SourceCodeFile(code);

        VersionControlSystem vcs = new VersionControlSystem();
        vcs.push(sourceCodeFile.add());

        sourceCodeFile.setContent("class MainApp { SourceCodeFile sourceCodeFile = new SourceCodeFile(code); vcs.push(sourceCodeFile.add()); }");
        vcs.push(sourceCodeFile.add());
        System.out.println(sourceCodeFile.getContent());
        sourceCodeFile.rollBack(vcs.pull(0));
        vcs.push(sourceCodeFile.add());
        System.out.println(sourceCodeFile.getContent());

    }
}
