#!/bin/bash

file_listing="/bos/tmp19/spalakod/clueweb12pp/kba/2013_sample_social_corpus/kba_first_10_days_files.txt"
netloc_and_path="http://s3.amazonaws.com/aws-publicdatasets/trec/kba/kba-streamcorpus-2014-v0_3_0/"

cd /bos/tmp19/spalakod/clueweb12pp/kba/2013_sample_social_corpus/

for filename in $(cat $file_listing)
do
    wget $netloc_and_path$filename
    sleep 1
done
