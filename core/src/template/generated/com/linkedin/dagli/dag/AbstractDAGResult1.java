// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the dag/AbstractDAGResultX.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.dag;

import com.linkedin.dagli.objectio.ObjectReader;
import com.linkedin.dagli.objectio.WrappedObjectReader;
import java.util.Objects;


/**
 * Base class for an object encapsulating the results of executing a DAG.
 *
 * @param <RA> the type of result #1 of the DAG
 */
abstract class AbstractDAGResult1<RA> extends WrappedObjectReader<RA> implements DAGResult1<RA>, AutoCloseable {
  private final ObjectReader<RA> _result1;

  /**
   * Create a new DAG result instance from the provided array of {@link ObjectReader}s.
   *
   * @param results an array of length 1 providing an {@link ObjectReader} for each of the DAG's outputs.
   */
  @SuppressWarnings("unchecked")
  AbstractDAGResult1(ObjectReader<?>[] results) {
    this((ObjectReader<RA>) results[0]);
    assert results.length == 1;
  }

  /**
   * Create a new DAG result instance from the provided {@link ObjectReader}s.
   *
   * @param results1 an {@link ObjectReader} for the DAG's first output.
   */
  AbstractDAGResult1(ObjectReader<RA> results1) {
    super(results1);

    _result1 = Objects.requireNonNull(results1);
  }

  @Override
  public void close() {
    _result1.close();
  }
}