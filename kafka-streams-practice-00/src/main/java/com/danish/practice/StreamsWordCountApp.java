package com.danish.practice;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;

import java.util.Properties;

public class StreamsWordCountApp {
    public static void main(String[] args) {

        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG,"word-count-app");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:29092");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG,Serdes.String().getClass());
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"earliest");
        props.put(StreamsConfig.CACHE_MAX_BYTES_BUFFERING_CONFIG,"0");

        StreamsBuilder streamsBuilder = new StreamsBuilder();
        //Build out topology
        

        
    }
}
