#!/bin/sh
#
# Called by "git commit" with one argument, the name of the file
# that has the commit message.  The hook should exit with non-zero
# status after issuing an appropriate message if it wants to stop the
# commit.  The hook is allowed to edit the commit message file.
#
# To enable this hook, rename this file to "commit-msg".
grep -E '^((Hook: .*)|(Docs: .*)|(L(\d+): [ A-Za-z0-9-]+ \(\d+ms\)))$' $1 || {
	echo >&2 "Incorrect commit message. Sample:\n\n    L123: LeetCode Problem Title (456ms)\n    Docs: Update section Foo    \n    Hook: Change something"
	exit 1
}
