// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

export class Crs {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):Crs {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsCrs(bb:flatbuffers.ByteBuffer, obj?:Crs):Crs {
  return (obj || new Crs()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsCrs(bb:flatbuffers.ByteBuffer, obj?:Crs):Crs {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new Crs()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

org():string|null
org(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
org(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

code():number {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? this.bb!.readInt32(this.bb_pos + offset) : 0;
}

name():string|null
name(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
name(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 8);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

description():string|null
description(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
description(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 10);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

wkt():string|null
wkt(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
wkt(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 12);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

codeString():string|null
codeString(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
codeString(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 14);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

static startCrs(builder:flatbuffers.Builder) {
  builder.startObject(6);
}

static addOrg(builder:flatbuffers.Builder, orgOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, orgOffset, 0);
}

static addCode(builder:flatbuffers.Builder, code:number) {
  builder.addFieldInt32(1, code, 0);
}

static addName(builder:flatbuffers.Builder, nameOffset:flatbuffers.Offset) {
  builder.addFieldOffset(2, nameOffset, 0);
}

static addDescription(builder:flatbuffers.Builder, descriptionOffset:flatbuffers.Offset) {
  builder.addFieldOffset(3, descriptionOffset, 0);
}

static addWkt(builder:flatbuffers.Builder, wktOffset:flatbuffers.Offset) {
  builder.addFieldOffset(4, wktOffset, 0);
}

static addCodeString(builder:flatbuffers.Builder, codeStringOffset:flatbuffers.Offset) {
  builder.addFieldOffset(5, codeStringOffset, 0);
}

static endCrs(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createCrs(builder:flatbuffers.Builder, orgOffset:flatbuffers.Offset, code:number, nameOffset:flatbuffers.Offset, descriptionOffset:flatbuffers.Offset, wktOffset:flatbuffers.Offset, codeStringOffset:flatbuffers.Offset):flatbuffers.Offset {
  Crs.startCrs(builder);
  Crs.addOrg(builder, orgOffset);
  Crs.addCode(builder, code);
  Crs.addName(builder, nameOffset);
  Crs.addDescription(builder, descriptionOffset);
  Crs.addWkt(builder, wktOffset);
  Crs.addCodeString(builder, codeStringOffset);
  return Crs.endCrs(builder);
}
}
