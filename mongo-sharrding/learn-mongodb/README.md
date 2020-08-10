# learn-mongodb
MongoDB stuff

[Associated YouTube Playlist](https://www.youtube.com/watch?v=LBthwZDRR-c&list=PL34sAs7_26wPvZJqUJhjyNtm7UedWR8Ps)

sh.enableSharding("exampleDB")

for i in {1..500}; do echo -e " use someDb \n db.address.insertOne({\"email\": \"gaurav@example.com\", \"a_id\": \"1 $i\"})" | /Users/gauravkumar/Downloads/mongodb-osx-x86_64-4.0.5/bin/mongo mongodb://127.0.0.1:27017; done



docker-compose exec router mongo

docker exec -it mongos1 bash -c "echo 'sh.shardCollection(\"testDb.testCollection\", {\"shardingField\" : 1})' | mongo "


mongos> db.createCollection("someDb.address")
{
	"ok" : 1,
	"operationTime" : Timestamp(1596967343, 2),
	"$clusterTime" : {
		"clusterTime" : Timestamp(1596967343, 2),
		"signature" : {
			"hash" : BinData(0,"AAAAAAAAAAAAAAAAAAAAAAAAAAA="),
			"keyId" : NumberLong(0)
		}
	}
}


sh.shardCollection("someDb.address", {"a_id":"hashed"})


for i in {1..500}; do echo -e " use someDb \n db.address.insertOne({\"email\": \"gaurav@example.com\", \"a_id\": \"1 $i\"})" | /Users/gauravkumar/Downloads/mongodb-osx-x86_64-4.0.5/bin/mongo mongodb://127.0.0.1:27017; done

mongos> db.address.getShardDistribution()