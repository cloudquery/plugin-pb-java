clone-proto:
	git clone https://github.com/cloudquery/plugin-pb

gen-proto:
	cd plugin-pb && git pull && cd ..

	mkdir -p ./src/main/proto/cloudquery/plugin/v3/
	cp ./plugin-pb/plugin/v3/*.proto ./src/main/proto/cloudquery/plugin/v3/.
	mkdir -p ./src/main/proto/cloudquery/discovery/v1
	cp ./plugin-pb/discovery/v1/*.proto ./src/main/proto/cloudquery/discovery/v1/.

	./gradlew build