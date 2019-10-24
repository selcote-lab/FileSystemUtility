package com.tonasolution;

public class Client {
    public static void main(String[] args) {

        FileSystemReceiver fs = FileSystemReceiverUtil.getFileSystemReceiver();

        Command cm = new OpenFileCommand(fs);
        FileInvoker invoker = new FileInvokerImpl(cm);

        invoker.execute();
    }
}
