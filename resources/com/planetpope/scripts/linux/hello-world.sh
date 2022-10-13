#!/bin/bash

if !test -f "$1"; then
    echo "$1 no exists."
    exit 1;
fi
