package org.wololo.flatgeobuf.generated;
// automatically generated by the FlatBuffers compiler, do not modify

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Header extends Table {
  public static Header getRootAsHeader(ByteBuffer _bb) { return getRootAsHeader(_bb, new Header()); }
  public static Header getRootAsHeader(ByteBuffer _bb, Header obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public Header __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public double envelope(int j) { int o = __offset(6); return o != 0 ? bb.getDouble(__vector(o) + j * 8) : 0; }
  public int envelopeLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer envelopeAsByteBuffer() { return __vector_as_bytebuffer(6, 8); }
  public ByteBuffer envelopeInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 8); }
  public int geometryType() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean hasZ() { int o = __offset(10); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasM() { int o = __offset(12); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasT() { int o = __offset(14); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasTM() { int o = __offset(16); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public Column columns(int j) { return columns(new Column(), j); }
  public Column columns(Column obj, int j) { int o = __offset(18); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int columnsLength() { int o = __offset(18); return o != 0 ? __vector_len(o) : 0; }
  public Column columnsByKey(String key) { int o = __offset(18); return o != 0 ? Column.__lookup_by_key(null, __vector(o), key, bb) : null; }
  public Column columnsByKey(Column obj, String key) { int o = __offset(18); return o != 0 ? Column.__lookup_by_key(obj, __vector(o), key, bb) : null; }
  public long featuresCount() { int o = __offset(20); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean fids() { int o = __offset(22); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public int indexNodeSize() { int o = __offset(24); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 16; }
  public Crs crs() { return crs(new Crs()); }
  public Crs crs(Crs obj) { int o = __offset(26); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createHeader(FlatBufferBuilder builder,
      int nameOffset,
      int envelopeOffset,
      int geometry_type,
      boolean hasZ,
      boolean hasM,
      boolean hasT,
      boolean hasTM,
      int columnsOffset,
      long features_count,
      boolean fids,
      int index_node_size,
      int crsOffset) {
    builder.startObject(12);
    Header.addFeaturesCount(builder, features_count);
    Header.addCrs(builder, crsOffset);
    Header.addColumns(builder, columnsOffset);
    Header.addEnvelope(builder, envelopeOffset);
    Header.addName(builder, nameOffset);
    Header.addIndexNodeSize(builder, index_node_size);
    Header.addFids(builder, fids);
    Header.addHasTM(builder, hasTM);
    Header.addHasT(builder, hasT);
    Header.addHasM(builder, hasM);
    Header.addHasZ(builder, hasZ);
    Header.addGeometryType(builder, geometry_type);
    return Header.endHeader(builder);
  }

  public static void startHeader(FlatBufferBuilder builder) { builder.startObject(12); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addEnvelope(FlatBufferBuilder builder, int envelopeOffset) { builder.addOffset(1, envelopeOffset, 0); }
  public static int createEnvelopeVector(FlatBufferBuilder builder, double[] data) { builder.startVector(8, data.length, 8); for (int i = data.length - 1; i >= 0; i--) builder.addDouble(data[i]); return builder.endVector(); }
  public static void startEnvelopeVector(FlatBufferBuilder builder, int numElems) { builder.startVector(8, numElems, 8); }
  public static void addGeometryType(FlatBufferBuilder builder, int geometryType) { builder.addByte(2, (byte)geometryType, (byte)0); }
  public static void addHasZ(FlatBufferBuilder builder, boolean hasZ) { builder.addBoolean(3, hasZ, false); }
  public static void addHasM(FlatBufferBuilder builder, boolean hasM) { builder.addBoolean(4, hasM, false); }
  public static void addHasT(FlatBufferBuilder builder, boolean hasT) { builder.addBoolean(5, hasT, false); }
  public static void addHasTM(FlatBufferBuilder builder, boolean hasTM) { builder.addBoolean(6, hasTM, false); }
  public static void addColumns(FlatBufferBuilder builder, int columnsOffset) { builder.addOffset(7, columnsOffset, 0); }
  public static int createColumnsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startColumnsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFeaturesCount(FlatBufferBuilder builder, long featuresCount) { builder.addLong(8, featuresCount, 0L); }
  public static void addFids(FlatBufferBuilder builder, boolean fids) { builder.addBoolean(9, fids, false); }
  public static void addIndexNodeSize(FlatBufferBuilder builder, int indexNodeSize) { builder.addShort(10, (short)indexNodeSize, (short)16); }
  public static void addCrs(FlatBufferBuilder builder, int crsOffset) { builder.addOffset(11, crsOffset, 0); }
  public static int endHeader(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishHeaderBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedHeaderBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }
}

