package org.kiji.testing.fakehtable

import java.io.DataInput
import java.io.DataOutput
import java.util.{List => JList}

import org.apache.hadoop.hbase.KeyValue
import org.apache.hadoop.hbase.filter.Filter
import org.apache.hadoop.hbase.filter.Filter.ReturnCode

/** Pass-through HBase filter, ie. behaves as if there were no filter. */
object PassThroughFilter extends Filter {
  override def reset() {
    // nothing to reset
  }

  override def filterAllRemaining(): Boolean = {
    return false  // keep scanning
  }

  override def filterRowKey(rowKey: Array[Byte], start: Int, end: Int): Boolean = {
    return false  // do not exclude row
  }

  override def filterKeyValue(kv: KeyValue): ReturnCode = {
    return ReturnCode.INCLUDE  // include all key/values
  }

  override def hasFilterRow(): Boolean = {
    return false
  }

  override def filterRow(kvs: JList[KeyValue]): Unit = {
    // do not alter the key/values
  }

  override def filterRow(): Boolean = {
    return false
  }

  override def transform(kv: KeyValue): KeyValue = {
    return kv  // do not transform key/values
  }

  override def getNextKeyHint(kv: KeyValue): KeyValue = {
    sys.error("should be dead code")
  }

  override def readFields(in: DataInput): Unit = {
    // nothing to read
  }

  override def write(out: DataOutput): Unit = {
    // nothing to write
  }
}
