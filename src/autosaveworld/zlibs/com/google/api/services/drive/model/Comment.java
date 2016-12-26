/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-10-17 16:43:55 UTC)
 * on 2016-11-17 at 13:55:42 UTC 
 * Modify at your own risk.
 */

package autosaveworld.zlibs.com.google.api.services.drive.model;

/**
 * A comment on a file in Google Drive.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Comment extends autosaveworld.zlibs.com.google.api.client.json.GenericJson {

  /**
   * A region of the document represented as a JSON string. See anchor documentation for details on
   * how to define and interpret anchor properties.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String anchor;

  /**
   * The user who wrote this comment.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private User author;

  /**
   * The ID of the comment.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String commentId;

  /**
   * The plain text content used to create this comment. This is not HTML safe and should only be
   * used as a starting point to make edits to a comment's content.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * The context of the file which is being commented on.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private Context context;

  /**
   * The date when this comment was first created.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private autosaveworld.zlibs.com.google.api.client.util.DateTime createdDate;

  /**
   * Whether this comment has been deleted. If a comment has been deleted the content will be
   * cleared and this will only represent a comment that once existed.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.Boolean deleted;

  /**
   * The file which this comment is addressing.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String fileId;

  /**
   * The title of the file which this comment is addressing.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String fileTitle;

  /**
   * HTML formatted content for this comment.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String htmlContent;

  /**
   * This is always drive#comment.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The date when this comment or any of its replies were last modified.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private autosaveworld.zlibs.com.google.api.client.util.DateTime modifiedDate;

  /**
   * Replies to this post.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.util.List<CommentReply> replies;

  /**
   * A link back to this comment.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The status of this comment. Status can be changed by posting a reply to a comment with the
   * desired status. - "open" - The comment is still open.  - "resolved" - The comment has been
   * resolved by one of its replies.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * A region of the document represented as a JSON string. See anchor documentation for details on
   * how to define and interpret anchor properties.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnchor() {
    return anchor;
  }

  /**
   * A region of the document represented as a JSON string. See anchor documentation for details on
   * how to define and interpret anchor properties.
   * @param anchor anchor or {@code null} for none
   */
  public Comment setAnchor(java.lang.String anchor) {
    this.anchor = anchor;
    return this;
  }

  /**
   * The user who wrote this comment.
   * @return value or {@code null} for none
   */
  public User getAuthor() {
    return author;
  }

  /**
   * The user who wrote this comment.
   * @param author author or {@code null} for none
   */
  public Comment setAuthor(User author) {
    this.author = author;
    return this;
  }

  /**
   * The ID of the comment.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommentId() {
    return commentId;
  }

  /**
   * The ID of the comment.
   * @param commentId commentId or {@code null} for none
   */
  public Comment setCommentId(java.lang.String commentId) {
    this.commentId = commentId;
    return this;
  }

  /**
   * The plain text content used to create this comment. This is not HTML safe and should only be
   * used as a starting point to make edits to a comment's content.
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * The plain text content used to create this comment. This is not HTML safe and should only be
   * used as a starting point to make edits to a comment's content.
   * @param content content or {@code null} for none
   */
  public Comment setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * The context of the file which is being commented on.
   * @return value or {@code null} for none
   */
  public Context getContext() {
    return context;
  }

  /**
   * The context of the file which is being commented on.
   * @param context context or {@code null} for none
   */
  public Comment setContext(Context context) {
    this.context = context;
    return this;
  }

  /**
   * The date when this comment was first created.
   * @return value or {@code null} for none
   */
  public autosaveworld.zlibs.com.google.api.client.util.DateTime getCreatedDate() {
    return createdDate;
  }

  /**
   * The date when this comment was first created.
   * @param createdDate createdDate or {@code null} for none
   */
  public Comment setCreatedDate(autosaveworld.zlibs.com.google.api.client.util.DateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Whether this comment has been deleted. If a comment has been deleted the content will be
   * cleared and this will only represent a comment that once existed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDeleted() {
    return deleted;
  }

  /**
   * Whether this comment has been deleted. If a comment has been deleted the content will be
   * cleared and this will only represent a comment that once existed.
   * @param deleted deleted or {@code null} for none
   */
  public Comment setDeleted(java.lang.Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * The file which this comment is addressing.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileId() {
    return fileId;
  }

  /**
   * The file which this comment is addressing.
   * @param fileId fileId or {@code null} for none
   */
  public Comment setFileId(java.lang.String fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * The title of the file which this comment is addressing.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileTitle() {
    return fileTitle;
  }

  /**
   * The title of the file which this comment is addressing.
   * @param fileTitle fileTitle or {@code null} for none
   */
  public Comment setFileTitle(java.lang.String fileTitle) {
    this.fileTitle = fileTitle;
    return this;
  }

  /**
   * HTML formatted content for this comment.
   * @return value or {@code null} for none
   */
  public java.lang.String getHtmlContent() {
    return htmlContent;
  }

  /**
   * HTML formatted content for this comment.
   * @param htmlContent htmlContent or {@code null} for none
   */
  public Comment setHtmlContent(java.lang.String htmlContent) {
    this.htmlContent = htmlContent;
    return this;
  }

  /**
   * This is always drive#comment.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always drive#comment.
   * @param kind kind or {@code null} for none
   */
  public Comment setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The date when this comment or any of its replies were last modified.
   * @return value or {@code null} for none
   */
  public autosaveworld.zlibs.com.google.api.client.util.DateTime getModifiedDate() {
    return modifiedDate;
  }

  /**
   * The date when this comment or any of its replies were last modified.
   * @param modifiedDate modifiedDate or {@code null} for none
   */
  public Comment setModifiedDate(autosaveworld.zlibs.com.google.api.client.util.DateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * Replies to this post.
   * @return value or {@code null} for none
   */
  public java.util.List<CommentReply> getReplies() {
    return replies;
  }

  /**
   * Replies to this post.
   * @param replies replies or {@code null} for none
   */
  public Comment setReplies(java.util.List<CommentReply> replies) {
    this.replies = replies;
    return this;
  }

  /**
   * A link back to this comment.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * A link back to this comment.
   * @param selfLink selfLink or {@code null} for none
   */
  public Comment setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The status of this comment. Status can be changed by posting a reply to a comment with the
   * desired status. - "open" - The comment is still open.  - "resolved" - The comment has been
   * resolved by one of its replies.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of this comment. Status can be changed by posting a reply to a comment with the
   * desired status. - "open" - The comment is still open.  - "resolved" - The comment has been
   * resolved by one of its replies.
   * @param status status or {@code null} for none
   */
  public Comment setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public Comment set(String fieldName, Object value) {
    return (Comment) super.set(fieldName, value);
  }

  @Override
  public Comment clone() {
    return (Comment) super.clone();
  }

  /**
   * The context of the file which is being commented on.
   */
  public static final class Context extends autosaveworld.zlibs.com.google.api.client.json.GenericJson {

    /**
     * The MIME type of the context snippet.
     * The value may be {@code null}.
     */
    @autosaveworld.zlibs.com.google.api.client.util.Key
    private java.lang.String type;

    /**
     * Data representation of the segment of the file being commented on. In the case of a text file
     * for example, this would be the actual text that the comment is about.
     * The value may be {@code null}.
     */
    @autosaveworld.zlibs.com.google.api.client.util.Key
    private java.lang.String value;

    /**
     * The MIME type of the context snippet.
     * @return value or {@code null} for none
     */
    public java.lang.String getType() {
      return type;
    }

    /**
     * The MIME type of the context snippet.
     * @param type type or {@code null} for none
     */
    public Context setType(java.lang.String type) {
      this.type = type;
      return this;
    }

    /**
     * Data representation of the segment of the file being commented on. In the case of a text file
     * for example, this would be the actual text that the comment is about.
     * @return value or {@code null} for none
     */
    public java.lang.String getValue() {
      return value;
    }

    /**
     * Data representation of the segment of the file being commented on. In the case of a text file
     * for example, this would be the actual text that the comment is about.
     * @param value value or {@code null} for none
     */
    public Context setValue(java.lang.String value) {
      this.value = value;
      return this;
    }

    @Override
    public Context set(String fieldName, Object value) {
      return (Context) super.set(fieldName, value);
    }

    @Override
    public Context clone() {
      return (Context) super.clone();
    }

  }

}
