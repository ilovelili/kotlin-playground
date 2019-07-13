#!/bin/sh
set -e

gradle build
gradle run
ktlint -F
