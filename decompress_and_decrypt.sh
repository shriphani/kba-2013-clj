#!/bin/bash

cd /bos/tmp19/spalakod/clueweb12pp/kba/2013_sample_social_corpus/

for filename in $(ls *.xz.gpg)
do
    gpg -d $filename > ${filename/xz.gpg/xz}
    echo "removing $filename"
    rm $filename
done
