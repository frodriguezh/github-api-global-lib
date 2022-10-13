#!/bin/bash
//echo Hello $1. Today is $2.
if ! cat $1; then
    echo "no existe archivo"
    exit 1;
fi
