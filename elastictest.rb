require 'elasticsearch'
require 'elastic-transport'
require 'elasticsearch-api'

# Colons and uppercase/lowercase don't matter when using
# the 'ca_fingerprint' parameter
CERT_FINGERPRINT = '94893669df10c4ee61973b97fa0155c593c9d8c0affd3d7aad3d86d9885c099d'

ELASTIC_USERNAME = "elastic"

# Password for the 'elastic' user generated by Elasticsearch
ELASTIC_PASSWORD = "nBkmYzGmbounnrMrRqcw"

CERT_DIR = "/home/ashburndave/Downloads/elastictemp/elasticsearch-8.2.0/config/certs/http_ca.crt"

# client = Elasticsearch::Client.new(
#   hosts:
# 	  [
#   	   {
#     	   host: 'my-protected-host',
#     	   port: '443',
#     	   user: 'USERNAME',
#     	   password: 'PASSWORD',
#     	   scheme: 'https'
#   	   }
# 	  ]
# )

## https://github.com/elastic/elasticsearch-ruby
## https://www.elastic.co/guide/en/elasticsearch/client/ruby-api/current/index.html
## gem install elasticsearch

## client = Elasticsearch::Client.new(log: true)

# client = Elasticsearch::Client.new(
#     # cloud_id: '<CloudID>'
#     # user: '<Username>',
#     # password: '<Password>',
#     user: 'elastic>',
#     password: 'nBkmYzGmbounnrMrRqcw'
# )

# ashburndave@dphnuc4:~/Downloads/elastictemp/elasticsearch-8.2.0/config/certs$ ls -la
# total 32
# drwxr-x--- 2 ashburndave ashburndave  4096 May 13 04:54 .
# drwxr-xr-x 4 ashburndave ashburndave  4096 May 13 04:54 ..
# -rw-rw---- 1 ashburndave ashburndave  1915 May 13 04:54 http_ca.crt
# -rw-rw---- 1 ashburndave ashburndave 10013 May 13 04:54 http.p12
# -rw-rw---- 1 ashburndave ashburndave  5822 May 13 04:54 transport.p12
# ashburndave@dphnuc4:~/Downloads/elastictemp/elasticsearch-8.2.0/config/certs$ 
# ashburndave@dphnuc4:~/Downloads/elastictemp/elasticsearch-8.2.0/config/certs$ pwd -P
# /home/ashburndave/Downloads/elastictemp/elasticsearch-8.2.0/config/certs
# ashburndave@dphnuc4:~/Downloads/elastictemp/elasticsearch-8.2.0/config/certs$ 

# client = Elasticsearch::Client.new(
#   host: "https://elastic:#{ELASTIC_PASSWORD}@localhost:9200",
#   transport_options: { ssl: { ca_path: CERT_DIR } }
# )

client = Elasticsearch::Client.new(
  hosts:
	  [
  	   {
    	#    host: 'localhost',
        #    host: '192.168.86.88',
           host: '127.0.0.1',
    	#    port: '443',
           port: '9200',
    	   user: ELASTIC_USERNAME,
    	   password: ELASTIC_PASSWORD,
    	   scheme: 'https'
  	   }
	  ]
)

# if you specify Elasticsearch host
# client = Elasticsearch::Client.new url: 'http://localhost:9200', log: true

client.transport.reload_connections!

client.cluster.health

client.search(q: 'test')
