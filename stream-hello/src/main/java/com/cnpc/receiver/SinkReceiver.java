package com.cnpc.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @ClassName SinkReceiver
 * @Description TODO
 * @Author magic_罗璋
 * @Date 2019/5/22 15:19
 * @Version 1.0
 **/

@EnableBinding(Sink.class)
public class SinkReceiver {

    public static final Logger log = LoggerFactory.getLogger( SinkReceiver.class );

    @StreamListener(Sink.INPUT)
    public void receiver(Object payLoad){
        log.info( "Received:"+payLoad );
    }
}
