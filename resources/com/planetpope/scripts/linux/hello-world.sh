#!/bin/bash
//echo Hello $1. Today is $2.
if ! cat $1; then
    echo "No existe archivo: $1"
    exit 1;
fi
