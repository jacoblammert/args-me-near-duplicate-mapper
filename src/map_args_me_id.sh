#!/bin/bash -e

. config

function ensureAnseriniIndexExists() {
	INPUT=${ARGS_ME_COLLECTION_DIR}/${1}
	OUTPUT=${ANSERINI_INDEX_DIR}/${1}

	# checke, ob output schon existiert...
	#echo "Index exists and is 231321123312 GB"
	#du -hs ordner
	# else:
	#mkdir output dir
	#echo "Lade Corpus von ${ARGS_ME_COLLECTION_DIR}/${1} nach ${ANSERINI_INDEX_DIR}/${1}"
	
	java -cp ${ANSERINI_INDEX_DIR}/../resources/argsme-anserini-integration-1.0-SNAPSHOT-jar-with-dependencies.jar \
		io.anserini.index.IndexCollection \
		-collection ArgsMePremiseConclusion \
		-input ${INPUT} \
		-index ${OUTPUT} \
		-generator DefaultLuceneDocumentGenerator \
		-threads 16 \
		-storePositions \
		-storeDocvectors \
		-storeRaw
}


# for version in Eingabe:
    ensureAnseriniIndexExists ${VERSION}

