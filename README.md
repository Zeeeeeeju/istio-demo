# istio-demo

* Kubernetes Version: v1.19.6
* SpringBoot app image link: https://hub.docker.com/repository/docker/zzeju/istio-demo

* Version 1: tag 1.0 
* Version 2: tag 2.0

## Practice

1. Setup k8s cluster (1 master 2 nodes) 

2. Use mongodb and k8s-spring-demo services (https://github.com/Zeeeeeeju/k8s-demo)

3. Istio Gateway
    * gateway.yaml
    
4. Istio Traffic Management (Virtual Service, Destination Rule)
    * Canary Deployment
        * virtualService-canary.yaml
    * Retry
        * virtualService-mirror.yaml
    * Mirror Flow
        * virtualService-v2-timeout-retry.yaml
    * Circuit Breaker
        * circuit-breaker.yaml
    * Route Rewrite (Control multiple version micro services)
        * Old version of service A request to API service V1, new version request to API service V2
        * virtualService-separate.yaml
            
5. Setup monitor
   * Kiali
   * Zipkin
   * Prometheus
   * Jaeger
   * Grafana

