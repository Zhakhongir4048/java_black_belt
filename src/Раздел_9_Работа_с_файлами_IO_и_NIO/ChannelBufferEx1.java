package Раздел_9_Работа_с_файлами_IO_и_NIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ChannelBufferEx1 {

    public static void main(String[] args) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
             FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder verse = new StringBuilder();
            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("Read " + byteRead);
                // Меняет режим записи буфера на чтение буфера, позиция становиться 0
                buffer.flip();
                while (buffer.hasRemaining()) {
                    verse.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(verse);
            String text = "\nThere are only two ways to live your life. One is as though nothing is a miracle. " +
                    "The other is as though everything is a miracle";
            // 1 способ
            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
            // Заносим цитату в буфер
            buffer2.put(text.getBytes(StandardCharsets.UTF_8));
            buffer2.flip();
            channel.write(buffer2);
            /* 2 способ. Более элегантный!
            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes(StandardCharsets.UTF_8));
            channel.write(buffer2);
             */
        }
    }

}
/*
FileChannel channel = file.getChannel();
ByteBuffer buffer = ByteBuffer.allocate(100);
channel.read(buffer) buffer.flip() buffer.hasRemaining()
buffer.get() buffer.clear() buffer.put( … )
channel.write(buffer) buffer.rewind() buffer.compact()
buffer.mark() buffer.reset()
*/