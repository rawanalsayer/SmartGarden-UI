package com.example.dell.smartgarden;

public class Constants {

    public static final String MQTT_BROKER_URL = "tcp://m15.cloudmqtt.com:16121";
    public static final String MQTT_USERNAME = "lwrmiitr";
    public static final String MQTT_PASSWORD = "SJhy-SHxd0tH";
    public static final int QOS = 2;
    //Topics
    public static final String PUBLISH_TOPIC_LEFT_FAN = "Actuators/LeftFan";
    public static final String PUBLISH_TOPIC_RIGHT_FAN = "Actuators/RightFan";
    public static final String PUBLISH_TOPIC_PUMP = "Actuators/Pump";
    public static final String PUBLISH_TOPIC_LIGHT = "Actuators/Light";

    public static final String SUBSCRIBE_TOPIC_LIGHT_SENSOR = "Sensors/LightIntensity";
    public static final String SUBSCRIBE_TOPIC_WATER_LEVEL = "Sensors/WaterLevel";
    public static final String SUBSCRIBE_TOPIC_SOILMOISTURE = "Sensors/SoilMoisture";
    public static final String SUBSCRIBE_TOPIC_TEMPERTURE = "Sensors/Temperature";
    public static final String SUBSCRIBE_TOPIC_HUMIDITY = "Sensors/Humidity";


    public static final String CLIENT_ID = "p";


}
