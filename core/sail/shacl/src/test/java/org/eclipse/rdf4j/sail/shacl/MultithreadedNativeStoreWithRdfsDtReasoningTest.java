package org.eclipse.rdf4j.sail.shacl;

import org.eclipse.rdf4j.sail.NotifyingSail;
import org.eclipse.rdf4j.sail.inferencer.fc.DirectTypeHierarchyInferencer;
import org.eclipse.rdf4j.sail.inferencer.fc.SchemaCachingRDFSInferencer;

public class MultithreadedNativeStoreWithRdfsDtReasoningTest extends MultithreadedNativeStoreTest {

	@Override
	NotifyingSail getBaseSail() {
		NotifyingSail nativeStore = super.getBaseSail();
		SchemaCachingRDFSInferencer rdfsSail = new SchemaCachingRDFSInferencer(nativeStore);
		DirectTypeHierarchyInferencer dtSail = new DirectTypeHierarchyInferencer(rdfsSail);
		return dtSail;
	}
}
