for windows:

    start zookeeper:

        bin\windows\zookeeper-server-start.bat config\zookeeper.properties

    start Kafka:
        
        bin\windows\kafka-server-start.bat config\server.properties

    open consumer window with messages:

        kafka-console-consumer.sh --topic topic --from-beginning --bootstrap-server localhost:9092