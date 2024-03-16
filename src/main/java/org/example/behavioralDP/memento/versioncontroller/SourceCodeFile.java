package org.example.behavioralDP.memento.versioncontroller;

public class SourceCodeFile {

    private String content;

    public SourceCodeFile(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Commit add(){
        return new Commit(this.content);
    }

    public void rollBack(Commit commit){
        content = commit.getContent();
    }
}
