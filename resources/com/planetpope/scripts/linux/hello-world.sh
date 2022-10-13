#!/bin/bash
//echo Hello $1. Today is $2.

if !test -f "$1"; then
    echo "$1 no exists."
    exit 1;
fi
