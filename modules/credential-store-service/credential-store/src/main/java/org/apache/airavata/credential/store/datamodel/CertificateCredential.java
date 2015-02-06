    /*
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
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.credential.store.datamodel;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all") public class CertificateCredential implements org.apache.thrift.TBase<CertificateCredential, CertificateCredential._Fields>, java.io.Serializable, Cloneable, Comparable<CertificateCredential> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CertificateCredential");

  private static final org.apache.thrift.protocol.TField COMMUNITY_USER_FIELD_DESC = new org.apache.thrift.protocol.TField("communityUser", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField NOT_AFTER_FIELD_DESC = new org.apache.thrift.protocol.TField("notAfter", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField X509_CERT_FIELD_DESC = new org.apache.thrift.protocol.TField("x509Cert", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PRIVATE_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("privateKey", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField LIFE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("lifeTime", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField NOT_BEFORE_FIELD_DESC = new org.apache.thrift.protocol.TField("notBefore", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField PERSISTED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("persistedTime", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CertificateCredentialStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CertificateCredentialTupleSchemeFactory());
  }

  public CommunityUser communityUser; // required
  public String notAfter; // optional
  public String x509Cert; // optional
  public String privateKey; // optional
  public int lifeTime; // optional
  public String notBefore; // optional
  public int persistedTime; // optional
  public String token; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  @SuppressWarnings("all") public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COMMUNITY_USER((short)1, "communityUser"),
    NOT_AFTER((short)2, "notAfter"),
    X509_CERT((short)3, "x509Cert"),
    PRIVATE_KEY((short)4, "privateKey"),
    LIFE_TIME((short)5, "lifeTime"),
    NOT_BEFORE((short)6, "notBefore"),
    PERSISTED_TIME((short)7, "persistedTime"),
    TOKEN((short)8, "token");

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
        case 1: // COMMUNITY_USER
          return COMMUNITY_USER;
        case 2: // NOT_AFTER
          return NOT_AFTER;
        case 3: // X509_CERT
          return X509_CERT;
        case 4: // PRIVATE_KEY
          return PRIVATE_KEY;
        case 5: // LIFE_TIME
          return LIFE_TIME;
        case 6: // NOT_BEFORE
          return NOT_BEFORE;
        case 7: // PERSISTED_TIME
          return PERSISTED_TIME;
        case 8: // TOKEN
          return TOKEN;
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
  private static final int __LIFETIME_ISSET_ID = 0;
  private static final int __PERSISTEDTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.NOT_AFTER,_Fields.X509_CERT,_Fields.PRIVATE_KEY,_Fields.LIFE_TIME,_Fields.NOT_BEFORE,_Fields.PERSISTED_TIME,_Fields.TOKEN};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMMUNITY_USER, new org.apache.thrift.meta_data.FieldMetaData("communityUser", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CommunityUser.class)));
    tmpMap.put(_Fields.NOT_AFTER, new org.apache.thrift.meta_data.FieldMetaData("notAfter", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.X509_CERT, new org.apache.thrift.meta_data.FieldMetaData("x509Cert", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRIVATE_KEY, new org.apache.thrift.meta_data.FieldMetaData("privateKey", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LIFE_TIME, new org.apache.thrift.meta_data.FieldMetaData("lifeTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NOT_BEFORE, new org.apache.thrift.meta_data.FieldMetaData("notBefore", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PERSISTED_TIME, new org.apache.thrift.meta_data.FieldMetaData("persistedTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOKEN, new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CertificateCredential.class, metaDataMap);
  }

  public CertificateCredential() {
  }

  public CertificateCredential(
    CommunityUser communityUser)
  {
    this();
    this.communityUser = communityUser;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CertificateCredential(CertificateCredential other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCommunityUser()) {
      this.communityUser = new CommunityUser(other.communityUser);
    }
    if (other.isSetNotAfter()) {
      this.notAfter = other.notAfter;
    }
    if (other.isSetX509Cert()) {
      this.x509Cert = other.x509Cert;
    }
    if (other.isSetPrivateKey()) {
      this.privateKey = other.privateKey;
    }
    this.lifeTime = other.lifeTime;
    if (other.isSetNotBefore()) {
      this.notBefore = other.notBefore;
    }
    this.persistedTime = other.persistedTime;
    if (other.isSetToken()) {
      this.token = other.token;
    }
  }

  public CertificateCredential deepCopy() {
    return new CertificateCredential(this);
  }

  @Override
  public void clear() {
    this.communityUser = null;
    this.notAfter = null;
    this.x509Cert = null;
    this.privateKey = null;
    setLifeTimeIsSet(false);
    this.lifeTime = 0;
    this.notBefore = null;
    setPersistedTimeIsSet(false);
    this.persistedTime = 0;
    this.token = null;
  }

  public CommunityUser getCommunityUser() {
    return this.communityUser;
  }

  public CertificateCredential setCommunityUser(CommunityUser communityUser) {
    this.communityUser = communityUser;
    return this;
  }

  public void unsetCommunityUser() {
    this.communityUser = null;
  }

  /** Returns true if field communityUser is set (has been assigned a value) and false otherwise */
  public boolean isSetCommunityUser() {
    return this.communityUser != null;
  }

  public void setCommunityUserIsSet(boolean value) {
    if (!value) {
      this.communityUser = null;
    }
  }

  public String getNotAfter() {
    return this.notAfter;
  }

  public CertificateCredential setNotAfter(String notAfter) {
    this.notAfter = notAfter;
    return this;
  }

  public void unsetNotAfter() {
    this.notAfter = null;
  }

  /** Returns true if field notAfter is set (has been assigned a value) and false otherwise */
  public boolean isSetNotAfter() {
    return this.notAfter != null;
  }

  public void setNotAfterIsSet(boolean value) {
    if (!value) {
      this.notAfter = null;
    }
  }

  public String getX509Cert() {
    return this.x509Cert;
  }

  public CertificateCredential setX509Cert(String x509Cert) {
    this.x509Cert = x509Cert;
    return this;
  }

  public void unsetX509Cert() {
    this.x509Cert = null;
  }

  /** Returns true if field x509Cert is set (has been assigned a value) and false otherwise */
  public boolean isSetX509Cert() {
    return this.x509Cert != null;
  }

  public void setX509CertIsSet(boolean value) {
    if (!value) {
      this.x509Cert = null;
    }
  }

  public String getPrivateKey() {
    return this.privateKey;
  }

  public CertificateCredential setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  public void unsetPrivateKey() {
    this.privateKey = null;
  }

  /** Returns true if field privateKey is set (has been assigned a value) and false otherwise */
  public boolean isSetPrivateKey() {
    return this.privateKey != null;
  }

  public void setPrivateKeyIsSet(boolean value) {
    if (!value) {
      this.privateKey = null;
    }
  }

  public int getLifeTime() {
    return this.lifeTime;
  }

  public CertificateCredential setLifeTime(int lifeTime) {
    this.lifeTime = lifeTime;
    setLifeTimeIsSet(true);
    return this;
  }

  public void unsetLifeTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LIFETIME_ISSET_ID);
  }

  /** Returns true if field lifeTime is set (has been assigned a value) and false otherwise */
  public boolean isSetLifeTime() {
    return EncodingUtils.testBit(__isset_bitfield, __LIFETIME_ISSET_ID);
  }

  public void setLifeTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LIFETIME_ISSET_ID, value);
  }

  public String getNotBefore() {
    return this.notBefore;
  }

  public CertificateCredential setNotBefore(String notBefore) {
    this.notBefore = notBefore;
    return this;
  }

  public void unsetNotBefore() {
    this.notBefore = null;
  }

  /** Returns true if field notBefore is set (has been assigned a value) and false otherwise */
  public boolean isSetNotBefore() {
    return this.notBefore != null;
  }

  public void setNotBeforeIsSet(boolean value) {
    if (!value) {
      this.notBefore = null;
    }
  }

  public int getPersistedTime() {
    return this.persistedTime;
  }

  public CertificateCredential setPersistedTime(int persistedTime) {
    this.persistedTime = persistedTime;
    setPersistedTimeIsSet(true);
    return this;
  }

  public void unsetPersistedTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PERSISTEDTIME_ISSET_ID);
  }

  /** Returns true if field persistedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetPersistedTime() {
    return EncodingUtils.testBit(__isset_bitfield, __PERSISTEDTIME_ISSET_ID);
  }

  public void setPersistedTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PERSISTEDTIME_ISSET_ID, value);
  }

  public String getToken() {
    return this.token;
  }

  public CertificateCredential setToken(String token) {
    this.token = token;
    return this;
  }

  public void unsetToken() {
    this.token = null;
  }

  /** Returns true if field token is set (has been assigned a value) and false otherwise */
  public boolean isSetToken() {
    return this.token != null;
  }

  public void setTokenIsSet(boolean value) {
    if (!value) {
      this.token = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COMMUNITY_USER:
      if (value == null) {
        unsetCommunityUser();
      } else {
        setCommunityUser((CommunityUser)value);
      }
      break;

    case NOT_AFTER:
      if (value == null) {
        unsetNotAfter();
      } else {
        setNotAfter((String)value);
      }
      break;

    case X509_CERT:
      if (value == null) {
        unsetX509Cert();
      } else {
        setX509Cert((String)value);
      }
      break;

    case PRIVATE_KEY:
      if (value == null) {
        unsetPrivateKey();
      } else {
        setPrivateKey((String)value);
      }
      break;

    case LIFE_TIME:
      if (value == null) {
        unsetLifeTime();
      } else {
        setLifeTime((Integer)value);
      }
      break;

    case NOT_BEFORE:
      if (value == null) {
        unsetNotBefore();
      } else {
        setNotBefore((String)value);
      }
      break;

    case PERSISTED_TIME:
      if (value == null) {
        unsetPersistedTime();
      } else {
        setPersistedTime((Integer)value);
      }
      break;

    case TOKEN:
      if (value == null) {
        unsetToken();
      } else {
        setToken((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COMMUNITY_USER:
      return getCommunityUser();

    case NOT_AFTER:
      return getNotAfter();

    case X509_CERT:
      return getX509Cert();

    case PRIVATE_KEY:
      return getPrivateKey();

    case LIFE_TIME:
      return Integer.valueOf(getLifeTime());

    case NOT_BEFORE:
      return getNotBefore();

    case PERSISTED_TIME:
      return Integer.valueOf(getPersistedTime());

    case TOKEN:
      return getToken();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COMMUNITY_USER:
      return isSetCommunityUser();
    case NOT_AFTER:
      return isSetNotAfter();
    case X509_CERT:
      return isSetX509Cert();
    case PRIVATE_KEY:
      return isSetPrivateKey();
    case LIFE_TIME:
      return isSetLifeTime();
    case NOT_BEFORE:
      return isSetNotBefore();
    case PERSISTED_TIME:
      return isSetPersistedTime();
    case TOKEN:
      return isSetToken();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CertificateCredential)
      return this.equals((CertificateCredential)that);
    return false;
  }

  public boolean equals(CertificateCredential that) {
    if (that == null)
      return false;

    boolean this_present_communityUser = true && this.isSetCommunityUser();
    boolean that_present_communityUser = true && that.isSetCommunityUser();
    if (this_present_communityUser || that_present_communityUser) {
      if (!(this_present_communityUser && that_present_communityUser))
        return false;
      if (!this.communityUser.equals(that.communityUser))
        return false;
    }

    boolean this_present_notAfter = true && this.isSetNotAfter();
    boolean that_present_notAfter = true && that.isSetNotAfter();
    if (this_present_notAfter || that_present_notAfter) {
      if (!(this_present_notAfter && that_present_notAfter))
        return false;
      if (!this.notAfter.equals(that.notAfter))
        return false;
    }

    boolean this_present_x509Cert = true && this.isSetX509Cert();
    boolean that_present_x509Cert = true && that.isSetX509Cert();
    if (this_present_x509Cert || that_present_x509Cert) {
      if (!(this_present_x509Cert && that_present_x509Cert))
        return false;
      if (!this.x509Cert.equals(that.x509Cert))
        return false;
    }

    boolean this_present_privateKey = true && this.isSetPrivateKey();
    boolean that_present_privateKey = true && that.isSetPrivateKey();
    if (this_present_privateKey || that_present_privateKey) {
      if (!(this_present_privateKey && that_present_privateKey))
        return false;
      if (!this.privateKey.equals(that.privateKey))
        return false;
    }

    boolean this_present_lifeTime = true && this.isSetLifeTime();
    boolean that_present_lifeTime = true && that.isSetLifeTime();
    if (this_present_lifeTime || that_present_lifeTime) {
      if (!(this_present_lifeTime && that_present_lifeTime))
        return false;
      if (this.lifeTime != that.lifeTime)
        return false;
    }

    boolean this_present_notBefore = true && this.isSetNotBefore();
    boolean that_present_notBefore = true && that.isSetNotBefore();
    if (this_present_notBefore || that_present_notBefore) {
      if (!(this_present_notBefore && that_present_notBefore))
        return false;
      if (!this.notBefore.equals(that.notBefore))
        return false;
    }

    boolean this_present_persistedTime = true && this.isSetPersistedTime();
    boolean that_present_persistedTime = true && that.isSetPersistedTime();
    if (this_present_persistedTime || that_present_persistedTime) {
      if (!(this_present_persistedTime && that_present_persistedTime))
        return false;
      if (this.persistedTime != that.persistedTime)
        return false;
    }

    boolean this_present_token = true && this.isSetToken();
    boolean that_present_token = true && that.isSetToken();
    if (this_present_token || that_present_token) {
      if (!(this_present_token && that_present_token))
        return false;
      if (!this.token.equals(that.token))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CertificateCredential other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCommunityUser()).compareTo(other.isSetCommunityUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommunityUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.communityUser, other.communityUser);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNotAfter()).compareTo(other.isSetNotAfter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotAfter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notAfter, other.notAfter);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetX509Cert()).compareTo(other.isSetX509Cert());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetX509Cert()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.x509Cert, other.x509Cert);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrivateKey()).compareTo(other.isSetPrivateKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrivateKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.privateKey, other.privateKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLifeTime()).compareTo(other.isSetLifeTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLifeTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lifeTime, other.lifeTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNotBefore()).compareTo(other.isSetNotBefore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotBefore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notBefore, other.notBefore);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPersistedTime()).compareTo(other.isSetPersistedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPersistedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.persistedTime, other.persistedTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetToken()).compareTo(other.isSetToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.token, other.token);
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
    StringBuilder sb = new StringBuilder("CertificateCredential(");
    boolean first = true;

    sb.append("communityUser:");
    if (this.communityUser == null) {
      sb.append("null");
    } else {
      sb.append(this.communityUser);
    }
    first = false;
    if (isSetNotAfter()) {
      if (!first) sb.append(", ");
      sb.append("notAfter:");
      if (this.notAfter == null) {
        sb.append("null");
      } else {
        sb.append(this.notAfter);
      }
      first = false;
    }
    if (isSetX509Cert()) {
      if (!first) sb.append(", ");
      sb.append("x509Cert:");
      if (this.x509Cert == null) {
        sb.append("null");
      } else {
        sb.append(this.x509Cert);
      }
      first = false;
    }
    if (isSetPrivateKey()) {
      if (!first) sb.append(", ");
      sb.append("privateKey:");
      if (this.privateKey == null) {
        sb.append("null");
      } else {
        sb.append(this.privateKey);
      }
      first = false;
    }
    if (isSetLifeTime()) {
      if (!first) sb.append(", ");
      sb.append("lifeTime:");
      sb.append(this.lifeTime);
      first = false;
    }
    if (isSetNotBefore()) {
      if (!first) sb.append(", ");
      sb.append("notBefore:");
      if (this.notBefore == null) {
        sb.append("null");
      } else {
        sb.append(this.notBefore);
      }
      first = false;
    }
    if (isSetPersistedTime()) {
      if (!first) sb.append(", ");
      sb.append("persistedTime:");
      sb.append(this.persistedTime);
      first = false;
    }
    if (isSetToken()) {
      if (!first) sb.append(", ");
      sb.append("token:");
      if (this.token == null) {
        sb.append("null");
      } else {
        sb.append(this.token);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (communityUser == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'communityUser' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (communityUser != null) {
      communityUser.validate();
    }
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

  private static class CertificateCredentialStandardSchemeFactory implements SchemeFactory {
    public CertificateCredentialStandardScheme getScheme() {
      return new CertificateCredentialStandardScheme();
    }
  }

  private static class CertificateCredentialStandardScheme extends StandardScheme<CertificateCredential> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CertificateCredential struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMMUNITY_USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.communityUser = new CommunityUser();
              struct.communityUser.read(iprot);
              struct.setCommunityUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NOT_AFTER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.notAfter = iprot.readString();
              struct.setNotAfterIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // X509_CERT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.x509Cert = iprot.readString();
              struct.setX509CertIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PRIVATE_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.privateKey = iprot.readString();
              struct.setPrivateKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LIFE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.lifeTime = iprot.readI32();
              struct.setLifeTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // NOT_BEFORE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.notBefore = iprot.readString();
              struct.setNotBeforeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PERSISTED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.persistedTime = iprot.readI32();
              struct.setPersistedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.token = iprot.readString();
              struct.setTokenIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CertificateCredential struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.communityUser != null) {
        oprot.writeFieldBegin(COMMUNITY_USER_FIELD_DESC);
        struct.communityUser.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.notAfter != null) {
        if (struct.isSetNotAfter()) {
          oprot.writeFieldBegin(NOT_AFTER_FIELD_DESC);
          oprot.writeString(struct.notAfter);
          oprot.writeFieldEnd();
        }
      }
      if (struct.x509Cert != null) {
        if (struct.isSetX509Cert()) {
          oprot.writeFieldBegin(X509_CERT_FIELD_DESC);
          oprot.writeString(struct.x509Cert);
          oprot.writeFieldEnd();
        }
      }
      if (struct.privateKey != null) {
        if (struct.isSetPrivateKey()) {
          oprot.writeFieldBegin(PRIVATE_KEY_FIELD_DESC);
          oprot.writeString(struct.privateKey);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetLifeTime()) {
        oprot.writeFieldBegin(LIFE_TIME_FIELD_DESC);
        oprot.writeI32(struct.lifeTime);
        oprot.writeFieldEnd();
      }
      if (struct.notBefore != null) {
        if (struct.isSetNotBefore()) {
          oprot.writeFieldBegin(NOT_BEFORE_FIELD_DESC);
          oprot.writeString(struct.notBefore);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPersistedTime()) {
        oprot.writeFieldBegin(PERSISTED_TIME_FIELD_DESC);
        oprot.writeI32(struct.persistedTime);
        oprot.writeFieldEnd();
      }
      if (struct.token != null) {
        if (struct.isSetToken()) {
          oprot.writeFieldBegin(TOKEN_FIELD_DESC);
          oprot.writeString(struct.token);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CertificateCredentialTupleSchemeFactory implements SchemeFactory {
    public CertificateCredentialTupleScheme getScheme() {
      return new CertificateCredentialTupleScheme();
    }
  }

  private static class CertificateCredentialTupleScheme extends TupleScheme<CertificateCredential> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CertificateCredential struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.communityUser.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetNotAfter()) {
        optionals.set(0);
      }
      if (struct.isSetX509Cert()) {
        optionals.set(1);
      }
      if (struct.isSetPrivateKey()) {
        optionals.set(2);
      }
      if (struct.isSetLifeTime()) {
        optionals.set(3);
      }
      if (struct.isSetNotBefore()) {
        optionals.set(4);
      }
      if (struct.isSetPersistedTime()) {
        optionals.set(5);
      }
      if (struct.isSetToken()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetNotAfter()) {
        oprot.writeString(struct.notAfter);
      }
      if (struct.isSetX509Cert()) {
        oprot.writeString(struct.x509Cert);
      }
      if (struct.isSetPrivateKey()) {
        oprot.writeString(struct.privateKey);
      }
      if (struct.isSetLifeTime()) {
        oprot.writeI32(struct.lifeTime);
      }
      if (struct.isSetNotBefore()) {
        oprot.writeString(struct.notBefore);
      }
      if (struct.isSetPersistedTime()) {
        oprot.writeI32(struct.persistedTime);
      }
      if (struct.isSetToken()) {
        oprot.writeString(struct.token);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CertificateCredential struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.communityUser = new CommunityUser();
      struct.communityUser.read(iprot);
      struct.setCommunityUserIsSet(true);
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.notAfter = iprot.readString();
        struct.setNotAfterIsSet(true);
      }
      if (incoming.get(1)) {
        struct.x509Cert = iprot.readString();
        struct.setX509CertIsSet(true);
      }
      if (incoming.get(2)) {
        struct.privateKey = iprot.readString();
        struct.setPrivateKeyIsSet(true);
      }
      if (incoming.get(3)) {
        struct.lifeTime = iprot.readI32();
        struct.setLifeTimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.notBefore = iprot.readString();
        struct.setNotBeforeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.persistedTime = iprot.readI32();
        struct.setPersistedTimeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.token = iprot.readString();
        struct.setTokenIsSet(true);
      }
    }
  }

}

