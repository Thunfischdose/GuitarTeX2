#!/bin/bash

filename=$PWD/gtx/back_to_black2.gtx

while [ "$1" != "" ]; do
    case $1 in
        -f | --file )           shift
                                filename=$1
                                ;;
        * )                     usage
                                exit 1
    esac
    shift
done

java -cp $PWD/GTX-Parser/bin Main -o $filename
exit 0
