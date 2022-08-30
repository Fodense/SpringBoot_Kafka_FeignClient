<h2>Spring boot, Kafka, @FeignClient </h2>

for windows:

start zookeeper:

        bin\windows\zookeeper-server-start.bat config\zookeeper.properties

start Kafka:
        
        bin\windows\kafka-server-start.bat config\server.properties

open consumer window with messages:

        kafka-console-consumer.sh --topic topic --from-beginning --bootstrap-server localhost:9092

info: 

    update config: object retention time
    
            kafka-configs.sh --alter --add-config retention.ms=100 --bootstrap-server=localhost:9092 --topic topic
        
    update config: set default settings
        
            kafka-configs.sh --alter --add-config retention.ms=604800000 --bootstrap-server=localhost:9092 --topic topic