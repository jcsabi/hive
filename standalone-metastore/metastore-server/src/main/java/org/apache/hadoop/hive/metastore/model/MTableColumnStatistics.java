/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
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
 *
 */
package org.apache.hadoop.hive.metastore.model;



/**
 *
 * MTableColumnStatistics - Represents Hive's Column Statistics Description. The fields in this
 * class with the exception of table are persisted in the metastore. In case of table, tbl_id is
 * persisted in its place.
 *
 */
public class MTableColumnStatistics {

  private MTable table;
  private String colName;
  private String colType;
  private String engine;

  private Long longLowValue;
  private Long longHighValue;
  private Double doubleLowValue;
  private Double doubleHighValue;
  private String decimalLowValue;
  private String decimalHighValue;
  private Long numNulls;
  private Long numDVs;
  private byte[] bitVector = new byte[] { 'H', 'L' };
  private byte[] histogram = new byte[] {};
  private Double avgColLen;
  private Long maxColLen;
  private Long numTrues;
  private Long numFalses;
  private long lastAnalyzed;

  public MTableColumnStatistics() {}

  public MTable getTable() {
    return table;
  }

  public void setTable(MTable table) {
    this.table = table;
  }

  public String getColName() {
    return colName;
  }

  public void setColName(String colName) {
    this.colName = colName;
  }

  public String getColType() {
    return colType;
  }

  public void setColType(String colType) {
    this.colType = colType;
  }

  public Long getNumNulls() {
    return numNulls;
  }

  public void setNumNulls(long numNulls) {
    this.numNulls = numNulls;
  }

  public Long getNumDVs() {
    return numDVs;
  }

  public void setNumDVs(long numDVs) {
    this.numDVs = numDVs;
  }

  public Double getAvgColLen() {
    return avgColLen;
  }

  public void setAvgColLen(double avgColLen) {
    this.avgColLen = avgColLen;
  }

  public Long getMaxColLen() {
    return maxColLen;
  }

  public void setMaxColLen(long maxColLen) {
    this.maxColLen = maxColLen;
  }

  public Long getNumTrues() {
    return numTrues;
  }

  public void setNumTrues(long numTrues) {
    this.numTrues = numTrues;
  }

  public Long getNumFalses() {
    return numFalses;
  }

  public void setNumFalses(long numFalses) {
    this.numFalses = numFalses;
  }

  public long getLastAnalyzed() {
    return lastAnalyzed;
  }

  public void setLastAnalyzed(long lastAnalyzed) {
    this.lastAnalyzed = lastAnalyzed;
  }

  public void setBooleanStats(Long numTrues, Long numFalses, Long numNulls) {
    this.numTrues = numTrues;
    this.numFalses = numFalses;
    this.numNulls = numNulls;
  }

  public void setLongStats(Long numNulls, Long numNDVs, byte[] bitVector, byte [] histogram,
      Long lowValue, Long highValue) {
    this.numNulls = numNulls;
    this.numDVs = numNDVs;
    setBitVector(bitVector);
    setHistogram(histogram);
    this.longLowValue = lowValue;
    this.longHighValue = highValue;
  }

  public void setDoubleStats(Long numNulls, Long numNDVs, byte[] bitVector, byte [] histogram,
      Double lowValue, Double highValue) {
    this.numNulls = numNulls;
    this.numDVs = numNDVs;
    setBitVector(bitVector);
    setHistogram(histogram);
    this.doubleLowValue = lowValue;
    this.doubleHighValue = highValue;
  }

  public void setDecimalStats(Long numNulls, Long numNDVs, byte[] bitVector, byte [] histogram,
      String lowValue, String highValue) {
    this.numNulls = numNulls;
    this.numDVs = numNDVs;
    setBitVector(bitVector);
    setHistogram(histogram);
    this.decimalLowValue = lowValue;
    this.decimalHighValue = highValue;
  }

  public void setStringStats(Long numNulls, Long numNDVs, byte[] bitVector, Long maxColLen, Double avgColLen) {
    this.numNulls = numNulls;
    this.numDVs = numNDVs;
    setBitVector(bitVector);
    this.maxColLen = maxColLen;
    this.avgColLen = avgColLen;
  }

  public void setBinaryStats(Long numNulls, Long maxColLen, Double avgColLen) {
    this.numNulls = numNulls;
    this.maxColLen = maxColLen;
    this.avgColLen = avgColLen;
  }

  public void setDateStats(Long numNulls, Long numNDVs, byte[] bitVector, byte [] histogram, Long lowValue, Long highValue) {
    this.numNulls = numNulls;
    this.numDVs = numNDVs;
    setBitVector(bitVector);
    setHistogram(histogram);
    this.longLowValue = lowValue;
    this.longHighValue = highValue;
  }

  public void setTimestampStats(Long numNulls, Long numNDVs, byte[] bitVector, byte [] histogram, Long lowValue, Long highValue) {
    this.numNulls = numNulls;
    this.numDVs = numNDVs;
    setBitVector(bitVector);
    setHistogram(histogram);
    this.longLowValue = lowValue;
    this.longHighValue = highValue;
  }

  public Long getLongLowValue() {
    return longLowValue;
  }

  public void setLongLowValue(long longLowValue) {
    this.longLowValue = longLowValue;
  }

  public Long getLongHighValue() {
    return longHighValue;
  }

  public void setLongHighValue(long longHighValue) {
    this.longHighValue = longHighValue;
  }

  public Double getDoubleLowValue() {
    return doubleLowValue;
  }

  public void setDoubleLowValue(double doubleLowValue) {
    this.doubleLowValue = doubleLowValue;
  }

  public Double getDoubleHighValue() {
    return doubleHighValue;
  }

  public void setDoubleHighValue(double doubleHighValue) {
    this.doubleHighValue = doubleHighValue;
  }


  public String getDecimalLowValue() {
    return decimalLowValue;
  }

  public void setDecimalLowValue(String decimalLowValue) {
    this.decimalLowValue = decimalLowValue;
  }

  public String getDecimalHighValue() {
    return decimalHighValue;
  }

  public void setDecimalHighValue(String decimalHighValue) {
    this.decimalHighValue = decimalHighValue;
  }

  public byte[] getBitVector() {
    // workaround for DN bug in persisting nulls in pg bytea column
    // instead set empty bit vector with header.
    // https://issues.apache.org/jira/browse/HIVE-17836
    if (bitVector != null && bitVector.length == 2 && bitVector[0] == 'H' && bitVector[1] == 'L') {
      return null;
    }
    return bitVector;
  }

  public void setBitVector(byte[] bitVector) {
    // workaround for DN bug in persisting nulls in pg bytea column
    // instead set empty bit vector with header.
    // https://issues.apache.org/jira/browse/HIVE-17836
    this.bitVector = (bitVector == null ? new byte[] { 'H', 'L' } : bitVector);
  }

  public byte[] getHistogram() {
    // workaround for DN bug in persisting nulls in pg bytea column instead set empty histogram.
    // https://issues.apache.org/jira/browse/HIVE-17836
    if (histogram != null && histogram.length == 0) {
      return null;
    }
    return histogram;
  }

  public void setHistogram(byte[] histogram) {
    // workaround for DN bug in persisting nulls in pg bytea column instead set empty histogram.
    // https://issues.apache.org/jira/browse/HIVE-17836
    this.histogram = (histogram == null ? new byte[] { } : histogram);
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }
}
