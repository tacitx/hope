package com.llk.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringEncoder;

import java.util.Date;


/**
 * @author llK
 * @date 2021/3/8
 */
public class NettyClient {
    public static void main(String[] args) throws InterruptedException {
        NioEventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group).channel(NioSocketChannel.class).handler(new ChannelInitializer<Channel>() {
            @Override
            protected void initChannel(Channel ch) throws Exception {
                ch.pipeline().addLast(new StringEncoder());
            }
        });
        Channel channel = bootstrap.connect("127.0.0.1", 8080).channel();
        while (true) {
            channel.writeAndFlush(new Date() + "hello server");
            Thread.sleep(2000);
        }
    }
}

