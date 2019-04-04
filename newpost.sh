#!/bin/bash
#
#    This script creates a new markdown post in /leetcode folder. The
#    naming convention is: ${id}.${title}.md
#
#    Usage:
#
#        ./newpost.sh 1 https://leetcode.com/problems/two-sum/
#
if [[ $# -lt 2 ]]
then
    echo 'usage: newpost.sh 1 https://leetcode.com/problems/two-sum/'
    exit 1
fi

id="$1"
url="$2"
name=$(echo "$url" | sed -E 's/.*problems\/(.*)\//\1/')

projhome=$(cd "$(dirname "$0")" || exit; pwd)
filename="${id}.${name}.md"
filepath="${projhome}/leetcode/${filename}"

if [[ -f "$filepath" ]]; then
    echo "$filepath already exists."
    exit 1
fi

cat << EOF >> "$filepath"
# ${id} Title

<${url}>, Level

## Description

## Idea

> How to solve the problem? Which strategy? Time estimation?
> Corner cases?

## Test Cases

## Solution

\`\`\`java
// TODO
\`\`\`

Runtime: ? ms (faster than ?%), Memory: ? MB (better than ?%)
EOF

echo "Post created: $filepath"
