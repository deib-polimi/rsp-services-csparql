/*******************************************************************************
 * Copyright 2013 DEIB - Politecnico di Milano
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package polimi.deib.rsp_service4csparql_server.stream.utilities;

import polimi.deib.rsp_service4csparql_server.common.CsparqlComponentStatus;

public class CsparqlStreamDescriptionForGet {

	private String streamIRI;
	private CsparqlComponentStatus status;
	
	public CsparqlStreamDescriptionForGet() {
		super();
	}
	public CsparqlStreamDescriptionForGet(String streamIRI, CsparqlComponentStatus status) {
		super();
		this.streamIRI = streamIRI;
		this.status = status;
	}
	
	public String getStream() {
		return streamIRI;
	}
	public void setStream(String streamIRI) {
		this.streamIRI = streamIRI;
	}
	public CsparqlComponentStatus getStatus() {
		return status;
	}
	public void setStatus(CsparqlComponentStatus status) {
		this.status = status;
	}
}
