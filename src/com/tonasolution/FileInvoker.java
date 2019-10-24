package com.tonasolution;

public interface FileInvoker {
    void execute();
}

class FileInvokerImpl implements FileInvoker {

    private Command command;

    public FileInvokerImpl(Command command) {
        this.command = command;
    }

    @Override
    public void execute() {
        this.command.execute();
    }
}
