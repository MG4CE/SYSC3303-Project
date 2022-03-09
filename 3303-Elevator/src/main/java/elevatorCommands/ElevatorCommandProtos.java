// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: elevator.proto

package elevatorCommands;

public final class ElevatorCommandProtos {
  private ElevatorCommandProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_elevatorCommands_WrapperMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_elevatorCommands_WrapperMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_elevatorCommands_ElevatorRequestMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_elevatorCommands_ElevatorRequestMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_elevatorCommands_SchedulerDispatchMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_elevatorCommands_SchedulerDispatchMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_elevatorCommands_ElevatorArrivedMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_elevatorCommands_ElevatorArrivedMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_elevatorCommands_ElevatorDepartureMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_elevatorCommands_ElevatorDepartureMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_elevatorCommands_FloorSensorMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_elevatorCommands_FloorSensorMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_elevatorCommands_LampMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_elevatorCommands_LampMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016elevator.proto\022\020elevatorCommands\"\246\003\n\016W" +
      "rapperMessage\022C\n\017elevatorRequest\030\001 \001(\0132(" +
      ".elevatorCommands.ElevatorRequestMessage" +
      "H\000\022G\n\021schedulerDispatch\030\002 \001(\0132*.elevator" +
      "Commands.SchedulerDispatchMessageH\000\022C\n\017e" +
      "levatorArrived\030\003 \001(\0132(.elevatorCommands." +
      "ElevatorArrivedMessageH\000\022G\n\021elevatorDepa" +
      "rture\030\004 \001(\0132*.elevatorCommands.ElevatorD" +
      "epartureMessageH\000\022;\n\013floorSensor\030\005 \001(\0132$" +
      ".elevatorCommands.FloorSensorMessageH\000\0224" +
      "\n\013lampMessage\030\006 \001(\0132\035.elevatorCommands.L" +
      "ampMessageH\000B\005\n\003msg\"\273\001\n\026ElevatorRequestM" +
      "essage\022\022\n\nelevatorID\030\001 \001(\r\022.\n\tdirection\030" +
      "\002 \001(\0162\033.elevatorCommands.Direction\022(\n\006bu" +
      "tton\030\003 \001(\0162\030.elevatorCommands.Button\022\r\n\005" +
      "floor\030\004 \001(\r\022\021\n\ttimeStamp\030\005 \001(\t\022\021\n\treques" +
      "tID\030\006 \001(\r\"g\n\030SchedulerDispatchMessage\022\022\n" +
      "\nelevatorID\030\001 \001(\r\022\021\n\tdestFloor\030\002 \001(\r\022\021\n\t" +
      "timeStamp\030\003 \001(\t\022\021\n\trequestID\030\004 \001(\r\"a\n\026El" +
      "evatorArrivedMessage\022\022\n\nelevatorID\030\001 \001(\r" +
      "\022\r\n\005floor\030\002 \001(\r\022\021\n\ttimeStamp\030\003 \001(\t\022\021\n\tre" +
      "questID\030\004 \001(\r\"\232\001\n\030ElevatorDepartureMessa" +
      "ge\022\022\n\nelevatorID\030\001 \001(\r\022.\n\tdirection\030\002 \001(" +
      "\0162\033.elevatorCommands.Direction\022\024\n\014initia" +
      "lFloor\030\003 \001(\r\022\021\n\ttimeStamp\030\004 \001(\t\022\021\n\treque" +
      "stID\030\005 \001(\r\"J\n\022FloorSensorMessage\022\022\n\nelev" +
      "atorID\030\001 \001(\r\022\r\n\005floor\030\002 \001(\r\022\021\n\ttimeStamp" +
      "\030\003 \001(\t\"\213\001\n\013LampMessage\022\r\n\005floor\030\001 \001(\r\022.\n" +
      "\tdirection\030\002 \001(\0162\033.elevatorCommands.Dire" +
      "ction\022*\n\005state\030\003 \001(\0162\033.elevatorCommands." +
      "LampState\022\021\n\ttimeStamp\030\004 \001(\t*-\n\tDirectio" +
      "n\022\006\n\002UP\020\000\022\010\n\004DOWN\020\001\022\016\n\nSTATIONARY\020\002*\034\n\tL" +
      "ampState\022\006\n\002ON\020\000\022\007\n\003OFF\020\001*$\n\006Button\022\014\n\010I" +
      "NTERIOR\020\000\022\014\n\010EXTERIOR\020\001B\031B\025ElevatorComma" +
      "ndProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_elevatorCommands_WrapperMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_elevatorCommands_WrapperMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_elevatorCommands_WrapperMessage_descriptor,
        new java.lang.String[] { "ElevatorRequest", "SchedulerDispatch", "ElevatorArrived", "ElevatorDeparture", "FloorSensor", "LampMessage", "Msg", });
    internal_static_elevatorCommands_ElevatorRequestMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_elevatorCommands_ElevatorRequestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_elevatorCommands_ElevatorRequestMessage_descriptor,
        new java.lang.String[] { "ElevatorID", "Direction", "Button", "Floor", "TimeStamp", "RequestID", });
    internal_static_elevatorCommands_SchedulerDispatchMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_elevatorCommands_SchedulerDispatchMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_elevatorCommands_SchedulerDispatchMessage_descriptor,
        new java.lang.String[] { "ElevatorID", "DestFloor", "TimeStamp", "RequestID", });
    internal_static_elevatorCommands_ElevatorArrivedMessage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_elevatorCommands_ElevatorArrivedMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_elevatorCommands_ElevatorArrivedMessage_descriptor,
        new java.lang.String[] { "ElevatorID", "Floor", "TimeStamp", "RequestID", });
    internal_static_elevatorCommands_ElevatorDepartureMessage_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_elevatorCommands_ElevatorDepartureMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_elevatorCommands_ElevatorDepartureMessage_descriptor,
        new java.lang.String[] { "ElevatorID", "Direction", "InitialFloor", "TimeStamp", "RequestID", });
    internal_static_elevatorCommands_FloorSensorMessage_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_elevatorCommands_FloorSensorMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_elevatorCommands_FloorSensorMessage_descriptor,
        new java.lang.String[] { "ElevatorID", "Floor", "TimeStamp", });
    internal_static_elevatorCommands_LampMessage_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_elevatorCommands_LampMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_elevatorCommands_LampMessage_descriptor,
        new java.lang.String[] { "Floor", "Direction", "State", "TimeStamp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}