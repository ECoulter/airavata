/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.data.movement;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Data Movement Interfaces
 * 
 * dataMovementInterfaceId: The Data Movement Interface has to be previously registered and referenced here.
 * 
 * priorityOrder:
 *  For resources with multiple interfaces, the priority order should be selected.
 *   Lower the numerical number, higher the priority
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-8")
public class DataMovementInterface implements org.apache.thrift.TBase<DataMovementInterface, DataMovementInterface._Fields>, java.io.Serializable, Cloneable, Comparable<DataMovementInterface> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DataMovementInterface");

  private static final org.apache.thrift.protocol.TField DATA_MOVEMENT_INTERFACE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dataMovementInterfaceId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DATA_MOVEMENT_PROTOCOL_FIELD_DESC = new org.apache.thrift.protocol.TField("dataMovementProtocol", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PRIORITY_ORDER_FIELD_DESC = new org.apache.thrift.protocol.TField("priorityOrder", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DataMovementInterfaceStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DataMovementInterfaceTupleSchemeFactory());
  }

  private String dataMovementInterfaceId; // required
  private DataMovementProtocol dataMovementProtocol; // required
  private int priorityOrder; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATA_MOVEMENT_INTERFACE_ID((short)1, "dataMovementInterfaceId"),
    /**
     * 
     * @see DataMovementProtocol
     */
    DATA_MOVEMENT_PROTOCOL((short)2, "dataMovementProtocol"),
    PRIORITY_ORDER((short)3, "priorityOrder");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DATA_MOVEMENT_INTERFACE_ID
          return DATA_MOVEMENT_INTERFACE_ID;
        case 2: // DATA_MOVEMENT_PROTOCOL
          return DATA_MOVEMENT_PROTOCOL;
        case 3: // PRIORITY_ORDER
          return PRIORITY_ORDER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PRIORITYORDER_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATA_MOVEMENT_INTERFACE_ID, new org.apache.thrift.meta_data.FieldMetaData("dataMovementInterfaceId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATA_MOVEMENT_PROTOCOL, new org.apache.thrift.meta_data.FieldMetaData("dataMovementProtocol", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, DataMovementProtocol.class)));
    tmpMap.put(_Fields.PRIORITY_ORDER, new org.apache.thrift.meta_data.FieldMetaData("priorityOrder", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DataMovementInterface.class, metaDataMap);
  }

  public DataMovementInterface() {
    this.priorityOrder = 0;

  }

  public DataMovementInterface(
    String dataMovementInterfaceId,
    DataMovementProtocol dataMovementProtocol,
    int priorityOrder)
  {
    this();
    this.dataMovementInterfaceId = dataMovementInterfaceId;
    this.dataMovementProtocol = dataMovementProtocol;
    this.priorityOrder = priorityOrder;
    setPriorityOrderIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DataMovementInterface(DataMovementInterface other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDataMovementInterfaceId()) {
      this.dataMovementInterfaceId = other.dataMovementInterfaceId;
    }
    if (other.isSetDataMovementProtocol()) {
      this.dataMovementProtocol = other.dataMovementProtocol;
    }
    this.priorityOrder = other.priorityOrder;
  }

  public DataMovementInterface deepCopy() {
    return new DataMovementInterface(this);
  }

  @Override
  public void clear() {
    this.dataMovementInterfaceId = null;
    this.dataMovementProtocol = null;
    this.priorityOrder = 0;

  }

  public String getDataMovementInterfaceId() {
    return this.dataMovementInterfaceId;
  }

  public void setDataMovementInterfaceId(String dataMovementInterfaceId) {
    this.dataMovementInterfaceId = dataMovementInterfaceId;
  }

  public void unsetDataMovementInterfaceId() {
    this.dataMovementInterfaceId = null;
  }

  /** Returns true if field dataMovementInterfaceId is set (has been assigned a value) and false otherwise */
  public boolean isSetDataMovementInterfaceId() {
    return this.dataMovementInterfaceId != null;
  }

  public void setDataMovementInterfaceIdIsSet(boolean value) {
    if (!value) {
      this.dataMovementInterfaceId = null;
    }
  }

  /**
   * 
   * @see DataMovementProtocol
   */
  public DataMovementProtocol getDataMovementProtocol() {
    return this.dataMovementProtocol;
  }

  /**
   * 
   * @see DataMovementProtocol
   */
  public void setDataMovementProtocol(DataMovementProtocol dataMovementProtocol) {
    this.dataMovementProtocol = dataMovementProtocol;
  }

  public void unsetDataMovementProtocol() {
    this.dataMovementProtocol = null;
  }

  /** Returns true if field dataMovementProtocol is set (has been assigned a value) and false otherwise */
  public boolean isSetDataMovementProtocol() {
    return this.dataMovementProtocol != null;
  }

  public void setDataMovementProtocolIsSet(boolean value) {
    if (!value) {
      this.dataMovementProtocol = null;
    }
  }

  public int getPriorityOrder() {
    return this.priorityOrder;
  }

  public void setPriorityOrder(int priorityOrder) {
    this.priorityOrder = priorityOrder;
    setPriorityOrderIsSet(true);
  }

  public void unsetPriorityOrder() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PRIORITYORDER_ISSET_ID);
  }

  /** Returns true if field priorityOrder is set (has been assigned a value) and false otherwise */
  public boolean isSetPriorityOrder() {
    return EncodingUtils.testBit(__isset_bitfield, __PRIORITYORDER_ISSET_ID);
  }

  public void setPriorityOrderIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PRIORITYORDER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DATA_MOVEMENT_INTERFACE_ID:
      if (value == null) {
        unsetDataMovementInterfaceId();
      } else {
        setDataMovementInterfaceId((String)value);
      }
      break;

    case DATA_MOVEMENT_PROTOCOL:
      if (value == null) {
        unsetDataMovementProtocol();
      } else {
        setDataMovementProtocol((DataMovementProtocol)value);
      }
      break;

    case PRIORITY_ORDER:
      if (value == null) {
        unsetPriorityOrder();
      } else {
        setPriorityOrder((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATA_MOVEMENT_INTERFACE_ID:
      return getDataMovementInterfaceId();

    case DATA_MOVEMENT_PROTOCOL:
      return getDataMovementProtocol();

    case PRIORITY_ORDER:
      return Integer.valueOf(getPriorityOrder());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DATA_MOVEMENT_INTERFACE_ID:
      return isSetDataMovementInterfaceId();
    case DATA_MOVEMENT_PROTOCOL:
      return isSetDataMovementProtocol();
    case PRIORITY_ORDER:
      return isSetPriorityOrder();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DataMovementInterface)
      return this.equals((DataMovementInterface)that);
    return false;
  }

  public boolean equals(DataMovementInterface that) {
    if (that == null)
      return false;

    boolean this_present_dataMovementInterfaceId = true && this.isSetDataMovementInterfaceId();
    boolean that_present_dataMovementInterfaceId = true && that.isSetDataMovementInterfaceId();
    if (this_present_dataMovementInterfaceId || that_present_dataMovementInterfaceId) {
      if (!(this_present_dataMovementInterfaceId && that_present_dataMovementInterfaceId))
        return false;
      if (!this.dataMovementInterfaceId.equals(that.dataMovementInterfaceId))
        return false;
    }

    boolean this_present_dataMovementProtocol = true && this.isSetDataMovementProtocol();
    boolean that_present_dataMovementProtocol = true && that.isSetDataMovementProtocol();
    if (this_present_dataMovementProtocol || that_present_dataMovementProtocol) {
      if (!(this_present_dataMovementProtocol && that_present_dataMovementProtocol))
        return false;
      if (!this.dataMovementProtocol.equals(that.dataMovementProtocol))
        return false;
    }

    boolean this_present_priorityOrder = true;
    boolean that_present_priorityOrder = true;
    if (this_present_priorityOrder || that_present_priorityOrder) {
      if (!(this_present_priorityOrder && that_present_priorityOrder))
        return false;
      if (this.priorityOrder != that.priorityOrder)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_dataMovementInterfaceId = true && (isSetDataMovementInterfaceId());
    list.add(present_dataMovementInterfaceId);
    if (present_dataMovementInterfaceId)
      list.add(dataMovementInterfaceId);

    boolean present_dataMovementProtocol = true && (isSetDataMovementProtocol());
    list.add(present_dataMovementProtocol);
    if (present_dataMovementProtocol)
      list.add(dataMovementProtocol.getValue());

    boolean present_priorityOrder = true;
    list.add(present_priorityOrder);
    if (present_priorityOrder)
      list.add(priorityOrder);

    return list.hashCode();
  }

  @Override
  public int compareTo(DataMovementInterface other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDataMovementInterfaceId()).compareTo(other.isSetDataMovementInterfaceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataMovementInterfaceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataMovementInterfaceId, other.dataMovementInterfaceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDataMovementProtocol()).compareTo(other.isSetDataMovementProtocol());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataMovementProtocol()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataMovementProtocol, other.dataMovementProtocol);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPriorityOrder()).compareTo(other.isSetPriorityOrder());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPriorityOrder()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.priorityOrder, other.priorityOrder);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DataMovementInterface(");
    boolean first = true;

    sb.append("dataMovementInterfaceId:");
    if (this.dataMovementInterfaceId == null) {
      sb.append("null");
    } else {
      sb.append(this.dataMovementInterfaceId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dataMovementProtocol:");
    if (this.dataMovementProtocol == null) {
      sb.append("null");
    } else {
      sb.append(this.dataMovementProtocol);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("priorityOrder:");
    sb.append(this.priorityOrder);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetDataMovementInterfaceId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dataMovementInterfaceId' is unset! Struct:" + toString());
    }

    if (!isSetDataMovementProtocol()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dataMovementProtocol' is unset! Struct:" + toString());
    }

    if (!isSetPriorityOrder()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'priorityOrder' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DataMovementInterfaceStandardSchemeFactory implements SchemeFactory {
    public DataMovementInterfaceStandardScheme getScheme() {
      return new DataMovementInterfaceStandardScheme();
    }
  }

  private static class DataMovementInterfaceStandardScheme extends StandardScheme<DataMovementInterface> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DataMovementInterface struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATA_MOVEMENT_INTERFACE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dataMovementInterfaceId = iprot.readString();
              struct.setDataMovementInterfaceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATA_MOVEMENT_PROTOCOL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.dataMovementProtocol = org.apache.airavata.model.data.movement.DataMovementProtocol.findByValue(iprot.readI32());
              struct.setDataMovementProtocolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRIORITY_ORDER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.priorityOrder = iprot.readI32();
              struct.setPriorityOrderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DataMovementInterface struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dataMovementInterfaceId != null) {
        oprot.writeFieldBegin(DATA_MOVEMENT_INTERFACE_ID_FIELD_DESC);
        oprot.writeString(struct.dataMovementInterfaceId);
        oprot.writeFieldEnd();
      }
      if (struct.dataMovementProtocol != null) {
        oprot.writeFieldBegin(DATA_MOVEMENT_PROTOCOL_FIELD_DESC);
        oprot.writeI32(struct.dataMovementProtocol.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PRIORITY_ORDER_FIELD_DESC);
      oprot.writeI32(struct.priorityOrder);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DataMovementInterfaceTupleSchemeFactory implements SchemeFactory {
    public DataMovementInterfaceTupleScheme getScheme() {
      return new DataMovementInterfaceTupleScheme();
    }
  }

  private static class DataMovementInterfaceTupleScheme extends TupleScheme<DataMovementInterface> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DataMovementInterface struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.dataMovementInterfaceId);
      oprot.writeI32(struct.dataMovementProtocol.getValue());
      oprot.writeI32(struct.priorityOrder);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DataMovementInterface struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.dataMovementInterfaceId = iprot.readString();
      struct.setDataMovementInterfaceIdIsSet(true);
      struct.dataMovementProtocol = org.apache.airavata.model.data.movement.DataMovementProtocol.findByValue(iprot.readI32());
      struct.setDataMovementProtocolIsSet(true);
      struct.priorityOrder = iprot.readI32();
      struct.setPriorityOrderIsSet(true);
    }
  }

}

