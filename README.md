The MODAClouds Deterministic Data Analyzer (rsp-services-csparql)
===========

In the context of MODAClouds European project (www.modaclouds.eu), Politecnico was
one of the partners involved in the development of the QoS Analysis and Monitoring Tools.

The Deterministic Data Analyzer (DDA) is the component responsible of aggregating, analyzing and verifying
conditions on monitoring data.

The original project (rsp-services-csparql) is available at [this link](https://github.com/streamreasoning/rsp-services-csparql),
this is a fork of the original repository, where the configuration was customized for the purposes of the MODAClouds Monitoring Platform.

Please refer to deliverable [D6.3.2](http://www.modaclouds.eu/publications/public-deliverables/) 
to better understand the role of this component in the MODAClouds Monitoring Platform.

Refer to the [Monitoring Platform Wiki](https://github.com/deib-polimi/modaclouds-monitoring-manager/wiki) for installation and usage of the whole platform.

# Installation

Requirements:
* Java 7 JDK
* Apache Maven 3+
* git

```
git clone https://github.com/deib-polimi/rsp-services-csparql.git
cd rsp-services-csparql
git checkout tags/0.4.6-modaclouds
mvn package assembly:single
cd ..
```

