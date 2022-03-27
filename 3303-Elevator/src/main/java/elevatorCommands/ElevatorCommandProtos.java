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
    internal_static_elevatorCommands_FaultMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_elevatorCommands_FaultMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_elevatorCommands_SimulateFaultMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_elevatorCommands_SimulateFaultMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_elevatorCommands_ElevatorRegisterMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_elevatorCommands_ElevatorRegisterMessage_fieldAccessorTable;
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
      "\n\016elevator.proto\022\020elevatorCommands\"\365\004\n\016W" +
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
      "ampMessageH\000\022D\n\017registerMessage\030\007 \001(\0132)." +
      "elevatorCommands.ElevatorRegisterMessage" +
      "H\000\0226\n\014faultMessage\030\010 \001(\0132\036.elevatorComma" +
      "nds.FaultMessageH\000\022A\n\017simFaultMessage\030\t " +
      "\001(\0132&.elevatorCommands.SimulateFaultMess" +
      "ageH\000\022\014\n\004TEST\030\n \001(\010B\005\n\003msg\"\201\001\n\014FaultMess" +
      "age\022\022\n\nelevatorID\030\001 \001(\r\022*\n\005fault\030\002 \001(\0162\033" +
      ".elevatorCommands.FaultType\022\017\n\007timeout\030\003" +
      " \001(\005\022\021\n\ttimeStamp\030\004 \001(\t\022\r\n\005floor\030\005 \001(\r\"z" +
      "\n\024SimulateFaultMessage\022\022\n\nelevatorID\030\001 \001" +
      "(\r\022*\n\005fault\030\002 \001(\0162\033.elevatorCommands.Fau" +
      "ltType\022\021\n\ttimeStamp\030\004 \001(\t\022\017\n\007timeout\030\005 \001" +
      "(\005\"O\n\027ElevatorRegisterMessage\022\022\n\nelevato" +
      "rID\030\001 \001(\r\022\r\n\005floor\030\002 \001(\r\022\021\n\ttimeStamp\030\003 " +
      "\001(\t\"\273\001\n\026ElevatorRequestMessage\022\022\n\nelevat" +
      "orID\030\001 \001(\r\022.\n\tdirection\030\002 \001(\0162\033.elevator" +
      "Commands.Direction\022(\n\006button\030\003 \001(\0162\030.ele" +
      "vatorCommands.Button\022\r\n\005floor\030\004 \001(\r\022\021\n\tt" +
      "imeStamp\030\005 \001(\t\022\021\n\trequestID\030\006 \001(\r\"g\n\030Sch" +
      "edulerDispatchMessage\022\022\n\nelevatorID\030\001 \001(" +
      "\r\022\021\n\tdestFloor\030\002 \001(\r\022\021\n\ttimeStamp\030\003 \001(\t\022" +
      "\021\n\trequestID\030\004 \001(\r\"a\n\026ElevatorArrivedMes" +
      "sage\022\022\n\nelevatorID\030\001 \001(\r\022\r\n\005floor\030\002 \001(\r\022" +
      "\021\n\ttimeStamp\030\003 \001(\t\022\021\n\trequestID\030\004 \001(\r\"\232\001" +
      "\n\030ElevatorDepartureMessage\022\022\n\nelevatorID" +
      "\030\001 \001(\r\022.\n\tdirection\030\002 \001(\0162\033.elevatorComm" +
      "ands.Direction\022\024\n\014initialFloor\030\003 \001(\r\022\021\n\t" +
      "timeStamp\030\004 \001(\t\022\021\n\trequestID\030\005 \001(\r\"J\n\022Fl" +
      "oorSensorMessage\022\022\n\nelevatorID\030\001 \001(\r\022\r\n\005" +
      "floor\030\002 \001(\r\022\021\n\ttimeStamp\030\003 \001(\t\"\237\001\n\013LampM" +
      "essage\022\r\n\005floor\030\001 \001(\r\022.\n\tdirection\030\002 \001(\016" +
      "2\033.elevatorCommands.Direction\022*\n\005state\030\003" +
      " \001(\0162\033.elevatorCommands.LampState\022\021\n\ttim" +
      "eStamp\030\004 \001(\t\022\022\n\nelevatorID\030\005 \001(\r*W\n\tFaul" +
      "tType\022\r\n\tDOORFAULT\020\000\022\031\n\025ELEVATOR_UNRESPO" +
      "NSIVE\020\001\022\022\n\016SCHEDULE_FAULT\020\002\022\014\n\010RESOLVED\020" +
      "\003*-\n\tDirection\022\006\n\002UP\020\000\022\010\n\004DOWN\020\001\022\016\n\nSTAT" +
      "IONARY\020\002*\034\n\tLampState\022\006\n\002ON\020\000\022\007\n\003OFF\020\001*$" +
      "\n\006Button\022\014\n\010INTERIOR\020\000\022\014\n\010EXTERIOR\020\001B\031B\025" +
      "ElevatorCommandProtosP\001b\006proto3"
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
        new java.lang.String[] { "ElevatorRequest", "SchedulerDispatch", "ElevatorArrived", "ElevatorDeparture", "FloorSensor", "LampMessage", "RegisterMessage", "FaultMessage", "SimFaultMessage", "TEST", "Msg", });
    internal_static_elevatorCommands_FaultMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_elevatorCommands_FaultMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_elevatorCommands_FaultMessage_descriptor,
        new java.lang.String[] { "ElevatorID", "Fault", "Timeout", "TimeStamp", "Floor", });
    internal_static_elevatorCommands_SimulateFaultMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_elevatorCommands_SimulateFaultMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_elevatorCommands_SimulateFaultMessage_descriptor,
        new java.lang.String[] { "ElevatorID", "Fault", "TimeStamp", "Timeout", });
    internal_static_elevatorCommands_ElevatorRegisterMessage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_elevatorCommands_ElevatorRegisterMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_elevatorCommands_ElevatorRegisterMessage_descriptor,
        new java.lang.String[] { "ElevatorID", "Floor", "TimeStamp", });
    internal_static_elevatorCommands_ElevatorRequestMessage_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_elevatorCommands_ElevatorRequestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_elevatorCommands_ElevatorRequestMessage_descriptor,
        new java.lang.String[] { "ElevatorID", "Direction", "Button", "Floor", "TimeStamp", "RequestID", });
    internal_static_elevatorCommands_SchedulerDispatchMessage_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_elevatorCommands_SchedulerDispatchMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_elevatorCommands_SchedulerDispatchMessage_descriptor,
        new java.lang.String[] { "ElevatorID", "DestFloor", "TimeStamp", "RequestID", });
    internal_static_elevatorCommands_ElevatorArrivedMessage_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_elevatorCommands_ElevatorArrivedMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_elevatorCommands_ElevatorArrivedMessage_descriptor,
        new java.lang.String[] { "ElevatorID", "Floor", "TimeStamp", "RequestID", });
    internal_static_elevatorCommands_ElevatorDepartureMessage_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_elevatorCommands_ElevatorDepartureMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_elevatorCommands_ElevatorDepartureMessage_descriptor,
        new java.lang.String[] { "ElevatorID", "Direction", "InitialFloor", "TimeStamp", "RequestID", });
    internal_static_elevatorCommands_FloorSensorMessage_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_elevatorCommands_FloorSensorMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_elevatorCommands_FloorSensorMessage_descriptor,
        new java.lang.String[] { "ElevatorID", "Floor", "TimeStamp", });
    internal_static_elevatorCommands_LampMessage_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_elevatorCommands_LampMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_elevatorCommands_LampMessage_descriptor,
        new java.lang.String[] { "Floor", "Direction", "State", "TimeStamp", "ElevatorID", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
