## Set up Sharding using Docker Containers

### Config servers
Start config servers (3 member replica set)
```
docker-compose -f config-server/docker-compose.yaml up -d
```
Initiate replica set
```
mongo mongodb://127.0.0.1:40001
```
```
rs.reconfig(
  {
    _id: "cfgrs",
    configsvr: true,
    members: [
      { _id : 0, host : "cfgsvr1:27017" },
      { _id : 1, host : "cfgsvr2:27017" },
      { _id : 2, host : "cfgsvr3:27017" }
    ]
  }
)

rs.status()
```

### Shard 1 servers
Start shard 1 servers (3 member replicas set)
```
docker-compose -f shard1/docker-compose.yaml up -d
```
Initiate replica set
```
mongo mongodb://127.0.0.1:50001
```
```
rs.initiate(
  {
    _id: "shard1rs",
    members: [
      { _id : 0, host : "shard1svr1" },
      { _id : 1, host : "shard1svr2" },
      { _id : 2, host : "shard1svr3" }
    ]
  }
)

rs.status()
```

### Mongos Router
Start mongos query router
```
docker-compose -f mongos/docker-compose.yaml up -d
```

### Add shard to the cluster
Connect to mongos
```
mongo mongodb://127.0.0.1:60000
```
Add shard
```
mongos> sh.addShard("shard1rs/127.0.0.1:50001,127.0.0.1:50002,127.0.0.1:50003")
mongos> sh.status()
```
## Adding another shard
### Shard 2 servers
Start shard 2 servers (3 member replicas set)
```
docker-compose -f shard2/docker-compose.yaml up -d
```
Initiate replica set
```
mongo mongodb://127.0.0.1:50004
```
```
rs.initiate(
  {
    _id: "shard2rs",
    members: [
      { _id : 0, host : "shard2svr1" },
      { _id : 1, host : "shard2svr2" },
      { _id : 2, host : "shard2svr3" }
    ]
  }
)

rs.status()
```
### Add shard to the cluster
Connect to mongos
```
mongo mongodb://127.0.0.1:60000
```
Add shard
```
mongos> sh.addShard("shard2rs/127.0.0.1:50004,127.0.0.1:50005,127.0.0.1:50006")
mongos> sh.status()
```
